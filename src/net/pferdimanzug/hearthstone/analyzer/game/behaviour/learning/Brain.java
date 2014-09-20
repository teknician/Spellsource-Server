package net.pferdimanzug.hearthstone.analyzer.game.behaviour.learning;

import java.io.IOException;
import java.util.List;

import net.pferdimanzug.hearthstone.analyzer.game.GameContext;
import net.pferdimanzug.hearthstone.analyzer.game.Player;
import net.pferdimanzug.hearthstone.analyzer.game.behaviour.neutralnetwork.HiddenUnit;
import net.pferdimanzug.hearthstone.analyzer.game.behaviour.neutralnetwork.NeuralNetwork;
import net.pferdimanzug.hearthstone.analyzer.game.entities.minions.Minion;
import net.pferdimanzug.hearthstone.analyzer.utils.MathUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Brain {

	private static Logger logger = LoggerFactory.getLogger(Brain.class);

	private static final int INPUTS = 51;
	private static final int HIDDEN_NEURONS = 80;
	private static final int OUTPUTS = 1;

	private static final double ALPHA = 0.01;
	private static final double BETA = 0.01;
	private static final double LAMBDA = 0.0;

	private boolean learning;
	private NeuralNetwork neuralNetwork;
	private double[][] ew;
	private double[][][] ev;

	public Brain() {
		neuralNetwork = new NeuralNetwork(INPUTS, new int[] { HIDDEN_NEURONS, OUTPUTS });
		ew = new double[HIDDEN_NEURONS][OUTPUTS];
		ev = new double[INPUTS][HIDDEN_NEURONS][OUTPUTS];
	}

	public double[] getOutput(GameContext context, int playerId) {
		double[] input = gameStateToInput(context, playerId);
		return neuralNetwork.getValue(input);
	}

	public double getEstimatedUtility(double[] output) {
		return output[0];
	}

	public void learn(GameContext originalState, int playerId, double[] nextOutput) {
		double[] currentInput = gameStateToInput(originalState, playerId);
		double[] currentOutput = getOutput(originalState, playerId);
		backPropagation(currentInput, currentOutput, nextOutput);
	}
	
	public void wipeEligabilityTraces() {
		ew = new double[HIDDEN_NEURONS][OUTPUTS];
		ev = new double[INPUTS][HIDDEN_NEURONS][OUTPUTS];
	}

	private void backPropagation(double[] in, double[] out, double[] expected) {
		// compute eligability traces
		for (int j = 0; j < neuralNetwork.hidden[0].length; j++) {
			for (int k = 0; k < out.length; k++) {
				ew[j][k] = (LAMBDA * ew[j][k]) + gradient(neuralNetwork.hidden[1][k]) * neuralNetwork.hidden[0][j].getValue();
				for (int i = 0; i < in.length; i++) {
					ev[i][j][k] = LAMBDA * ev[i][j][k] + gradient(neuralNetwork.hidden[1][k]) * neuralNetwork.hidden[1][k].weights[j]
							* gradient(neuralNetwork.hidden[0][j]) * in[i];
				}
			}
		}

		double[] error = new double[out.length];
		for (int k = 0; k < out.length; k++) {
			error[k] = expected[k] - out[k];
		}

		for (int j = 0; j < neuralNetwork.hidden[0].length; j++) {
			for (int k = 0; k < out.length; k++) {
				// weight from j to k, shown with learning param of BETA
				neuralNetwork.hidden[1][k].weights[j] += BETA * error[k] * ew[j][k];
				for (int i = 0; i < in.length; i++) {
					neuralNetwork.hidden[0][j].weights[i] += ALPHA * error[k] * ev[i][j][k];
				}
			}
		}
	}

	private double gradient(HiddenUnit hiddenUnit) {
		return hiddenUnit.getValue() * (1.0 - hiddenUnit.getValue());
	}

	public boolean isLearning() {
		return learning;
	}

	public void setLearning(boolean learning) {
		this.learning = learning;
	}

	private double[] gameStateToInput(GameContext context, int playerId) {
		double[] input = new double[INPUTS];
		Player player = context.getPlayer(playerId);
		Player opponent = context.getOpponent(player);
		encodePlayer(player, input, 0);
		encodePlayer(opponent, input, INPUTS / 2);
		input[50] = MathUtils.clamp01(context.getTurn() / 20.0);
		return input;
	}

	private void encodePlayer(Player player, double[] data, int offset) {
		List<Minion> minions = player.getMinions();
		for (int i = 0; i < 7; i++) {
			Minion minion = i < minions.size() ? player.getMinions().get(i) : null;
			data[offset++] = minion != null ? MathUtils.clamp01(minion.getAttack() / 15.0) : -1;
			data[offset++] = minion != null ? MathUtils.clamp01(minion.getHp() / 15.0) : -1;
			data[offset++] = minion != null ? (minion.getSpellTrigger() != null ? 1 : -1) : -1;
		}
		data[offset++] = MathUtils.clamp01(player.getHero().getAttack() / 10.0);
		data[offset++] = MathUtils.clamp01((player.getHero().getHp() + player.getHero().getArmor()) / 30.0);
		data[offset++] = player.getHand().getCount() / 10.0;
		data[offset++] = MathUtils.clamp01(player.getDeck().getCount() / 30.0);
	}

	public void load(String path) {
		try {
			neuralNetwork = NeuralNetwork.readFrom(path);
			logger.info("Saved brain data loaded");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			logger.info("Brain data not found, using unlearned neural network");
		}
	}

	public void save(String path) {
		try {
			neuralNetwork.writeTo(path);
			logger.info("Brain data saved to: " + path);
		} catch (IOException e) {
		}
	}
}
