package net.demilich.metastone.game.spells.desc.condition;

import net.demilich.metastone.game.GameContext;
import net.demilich.metastone.game.Player;
import net.demilich.metastone.game.entities.Entity;
import net.demilich.metastone.game.entities.minions.Race;

/**
 * This not a programmers nightmare poured into a class; rather a condition if the specified target is of a certain
 * race
 *
 * ++doombubbles
 */
public class RaceCondition extends Condition {

	private static final long serialVersionUID = -7599787433484503042L;

	public RaceCondition(ConditionDesc desc) {
		super(desc);
	}

	@Override
	protected boolean isFulfilled(GameContext context, Player player, ConditionDesc desc, Entity source, Entity target) {
		Race race = (Race) desc.get(ConditionArg.RACE);
		return target.getSourceCard().hasRace(race);
	}

}
