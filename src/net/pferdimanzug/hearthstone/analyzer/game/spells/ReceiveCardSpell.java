package net.pferdimanzug.hearthstone.analyzer.game.spells;

import java.util.Collection;

import net.pferdimanzug.hearthstone.analyzer.game.GameContext;
import net.pferdimanzug.hearthstone.analyzer.game.Player;
import net.pferdimanzug.hearthstone.analyzer.game.cards.Card;
import net.pferdimanzug.hearthstone.analyzer.game.entities.Entity;

public class ReceiveCardSpell extends Spell {

	private TargetPlayer targetPlayer;

	public ReceiveCardSpell(Card card) {
		this(TargetPlayer.SELF, card);
	}

	public ReceiveCardSpell(TargetPlayer targetPlayer, Card... cards) {
		this.targetPlayer = targetPlayer;
		setCloneableData(cards);
	}

	public Collection<Card> getCards() {
		return getCloneableDataCollection();
	}

	@Override
	protected void onCast(GameContext context, Player player, Entity target) {
		Player opponent = context.getOpponent(player);
		switch (targetPlayer) {
		case BOTH:
			receiveCards(context, player);
			receiveCards(context, opponent);
			break;
		case OPPONENT:
			receiveCards(context, opponent);
			break;
		case SELF:
			receiveCards(context, player);
			break;
		}

	}

	private void receiveCards(GameContext context, Player player) {
		for (Card card : getCards()) {
			context.getLogic().receiveCard(player.getId(), card.clone());
		}
	}

}
