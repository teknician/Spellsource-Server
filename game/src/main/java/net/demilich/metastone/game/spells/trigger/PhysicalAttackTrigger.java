package net.demilich.metastone.game.spells.trigger;

import net.demilich.metastone.game.entities.Entity;
import net.demilich.metastone.game.entities.EntityType;
import net.demilich.metastone.game.events.GameEvent;
import net.demilich.metastone.game.events.GameEventType;
import net.demilich.metastone.game.events.PhysicalAttackEvent;
import net.demilich.metastone.game.spells.desc.trigger.EventTriggerArg;
import net.demilich.metastone.game.spells.desc.trigger.EventTriggerDesc;

public class PhysicalAttackTrigger extends EventTrigger {

	private static final long serialVersionUID = 5961114707597874335L;

	public PhysicalAttackTrigger(EventTriggerDesc desc) {
		super(desc);
	}

	@Override
	protected boolean fire(GameEvent event, Entity host) {
		PhysicalAttackEvent physicalAttackEvent = (PhysicalAttackEvent) event;

		EntityType sourceEntityType = (EntityType) getDesc().get(EventTriggerArg.SOURCE_ENTITY_TYPE);
		if (sourceEntityType != null && physicalAttackEvent.getAttacker().getEntityType() != sourceEntityType) {
			return false;
		}

		EntityType targetEntityType = (EntityType) getDesc().get(EventTriggerArg.TARGET_ENTITY_TYPE);
		if (targetEntityType != null && physicalAttackEvent.getDefender().getEntityType() != targetEntityType) {
			return false;
		}

		return true;
	}

	@Override
	public GameEventType interestedIn() {
		return GameEventType.PHYSICAL_ATTACK;
	}
}
