package net.demilich.metastone.game.spells.desc.condition;

import net.demilich.metastone.game.GameContext;
import net.demilich.metastone.game.Player;
import net.demilich.metastone.game.entities.Entity;
import net.demilich.metastone.game.targeting.EntityReference;

import java.util.List;

public class IsDeadCondition extends Condition {

	private static final long serialVersionUID = -8552717175155591475L;

	public IsDeadCondition(ConditionDesc desc) {
		super(desc);
	}

	@Override
	protected boolean isFulfilled(GameContext context, Player player, ConditionDesc desc, Entity source, Entity target) {
		EntityReference entityReference = (EntityReference) desc.get(ConditionArg.TARGET);
		Entity entity = null;
		if (entityReference == null) {
			entity = target;
		} else {
			List<Entity> entities = context.resolveTarget(player, source, entityReference);
			if (entities == null || entities.isEmpty()) {
				return false;
			}
			entity = entities.get(0);
		}
		return entity.isDestroyed();
	}

}
