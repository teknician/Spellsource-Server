package net.pferdimanzug.hearthstone.analyzer.game.behaviour;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import net.pferdimanzug.hearthstone.analyzer.game.GameContext;
import net.pferdimanzug.hearthstone.analyzer.game.Player;
import net.pferdimanzug.hearthstone.analyzer.game.actions.GameAction;
import net.pferdimanzug.hearthstone.analyzer.game.cards.Card;
import net.pferdimanzug.hearthstone.analyzer.game.entities.Entity;
import net.pferdimanzug.hearthstone.analyzer.game.logic.GameLogic;
import net.pferdimanzug.hearthstone.analyzer.utils.Tuple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlatMonteCarlo extends Behaviour {

	private final static Logger logger = LoggerFactory.getLogger(FlatMonteCarlo.class);

	private int iterations;

	public FlatMonteCarlo(int iterations) {
		this.iterations = iterations;
	}

	@Override
	public String getName() {
		return "Flat Monte-Carlo " + iterations;
	}

	@Override
	public List<Card> mulligan(GameContext context, Player player, List<Card> cards) {
		List<Card> discardedCards = new ArrayList<Card>();
		for (Card card : cards) {
			if (card.getBaseManaCost() >= 4) {
				discardedCards.add(card);
			}
		}
		return discardedCards;
	}

	@Override
	public Entity provideTargetFor(Player player, GameAction action) {
		// TODO: copied from PlayRandomBehaviour
		List<Entity> validTargets = action.getValidTargets();
		if (validTargets.isEmpty()) {
			return null;
		}

		Entity randomTarget = validTargets.get(ThreadLocalRandom.current().nextInt(validTargets.size()));
		if (randomTarget != null) {
			logger.debug(player.getName() + " picks random target: " + randomTarget.getName());
		}
		return randomTarget;
	}

	@Override
	public GameAction requestAction(GameContext context, Player player, List<GameAction> validActions) {
		if (validActions.size() == 1) {
			return validActions.get(0);
		}
		GameLogic.logger.debug("********SIMULATION starts**********");
		HashMap<Tuple<GameAction, Entity>, Integer> actionScores = new HashMap<>();
		for (GameAction gameAction : validActions) {
			if (gameAction.getValidTargets() == null) {
				int score = simulate(context, player.getId(), gameAction, null);
				Tuple<GameAction, Entity> actionEntry = new Tuple<GameAction, Entity>(gameAction, null);
				actionScores.put(actionEntry, score);
				logger.debug("Action {} gets score of {}", gameAction.getActionType(), score);
			} else {
				for (Entity target : gameAction.getValidTargets()) {
					int score = simulate(context, player.getId(), gameAction, target);
					Tuple<GameAction, Entity> actionEntry = new Tuple<GameAction, Entity>(gameAction, target);
					actionScores.put(actionEntry, score);
					logger.debug("Action {} gets score of {}", gameAction.getActionType(), score);
				}
			}
		}
		GameLogic.logger.debug("********SIMULATION ENDS**********");
		Tuple<GameAction, Entity> bestActionEntry = getBestAction(actionScores);
		GameAction bestAction = bestActionEntry.getFirst();
		Entity target = bestActionEntry.getSecond();
		if (target != null) {
			bestAction.setTarget(target);
		}

		return bestAction;
	}

	private Tuple<GameAction, Entity> getBestAction(HashMap<Tuple<GameAction, Entity>, Integer> actionScores) {
		Tuple<GameAction, Entity> bestAction = null;
		int bestScore = Integer.MIN_VALUE;
		for (Tuple<GameAction, Entity> actionEntry : actionScores.keySet()) {
			int score = actionScores.get(actionEntry);
			if (score > bestScore) {
				bestAction = actionEntry;
				bestScore = score;
			}
		}
		logger.debug("Best action determined by MonteCarlo: " + bestAction.getFirst().getActionType());
		return bestAction;
	}

	private int simulate(GameContext context, int playerId, GameAction action, Entity target) {
		GameContext simulation = context.clone();
		if (target != null) {
			action.setTarget(target);
		}
		GameLogic.logger.debug("********TESTING FOLLOWING ACTION IN MONTE CARLO**********");
		simulation.getLogic().performGameAction(playerId, action);
		int score = 0;
		for (int i = 0; i < iterations; i++) {
			score += playRandomUntilEnd(simulation.clone(), playerId);
		}
		return score;
	}

	private int playRandomUntilEnd(GameContext simulation, int playerId) {
		for (Player player : simulation.getPlayers()) {
			player.setBehaviour(new PlayRandomBehaviour());
		}

		simulation.playTurn();

		return simulation.isWinner(playerId) ? 1 : -1;
	}

}
