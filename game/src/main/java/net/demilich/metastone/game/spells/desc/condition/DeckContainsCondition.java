package net.demilich.metastone.game.spells.desc.condition;

import net.demilich.metastone.game.GameContext;
import net.demilich.metastone.game.Player;
import net.demilich.metastone.game.cards.Card;
import net.demilich.metastone.game.entities.Entity;
import net.demilich.metastone.game.spells.TargetPlayer;
import net.demilich.metastone.game.spells.desc.filter.EntityFilter;

public class DeckContainsCondition extends Condition {

	private static final long serialVersionUID = -3897795367926658401L;

	public DeckContainsCondition(ConditionDesc desc) {
		super(desc);
	}

	@Override
	protected boolean isFulfilled(GameContext context, Player player, ConditionDesc desc, Entity source, Entity target) {
		EntityFilter cardFilter = (EntityFilter) desc.get(ConditionArg.CARD_FILTER);
		if (desc.containsKey(ConditionArg.TARGET_PLAYER)) {
			switch ((TargetPlayer) desc.get(ConditionArg.TARGET_PLAYER)) {
				case OPPONENT:
					player = context.getOpponent(player);
					break;
				default:
					break;
			}
		}
		for (Card card : player.getDeck()) {
			if (cardFilter == null || cardFilter.matches(context, player, card, source)) {
				return true;
			}
		}
		return false;
	}

}
