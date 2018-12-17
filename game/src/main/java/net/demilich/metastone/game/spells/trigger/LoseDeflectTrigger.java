package net.demilich.metastone.game.spells.trigger;

import net.demilich.metastone.game.entities.Entity;
import net.demilich.metastone.game.entities.EntityType;
import net.demilich.metastone.game.events.GameEvent;
import net.demilich.metastone.game.events.GameEventType;
import net.demilich.metastone.game.events.LoseDeflectEvent;
import net.demilich.metastone.game.spells.desc.trigger.EventTriggerArg;
import net.demilich.metastone.game.spells.desc.trigger.EventTriggerDesc;

public class LoseDeflectTrigger extends EventTrigger {
	private static final long serialVersionUID = 4164207077869877017L;

	public LoseDeflectTrigger(EventTriggerDesc desc) {
		super(desc);
	}

	@Override
	protected boolean fire(GameEvent event, Entity host) {
		LoseDeflectEvent loseDeflectEvent = (LoseDeflectEvent) event;

		EntityType sourceEntityType = (EntityType) getDesc().get(EventTriggerArg.SOURCE_ENTITY_TYPE);
		if (sourceEntityType != null && loseDeflectEvent.getSource().getEntityType() != sourceEntityType) {
			return false;
		}

		EntityType targetEntityType = (EntityType) getDesc().get(EventTriggerArg.TARGET_ENTITY_TYPE);
		if (targetEntityType != null && loseDeflectEvent.getVictim().getEntityType() != targetEntityType) {
			return false;
		}

		return true;
	}

	@Override
	public GameEventType interestedIn() {
		return GameEventType.LOSE_DEFLECT;
	}
}
