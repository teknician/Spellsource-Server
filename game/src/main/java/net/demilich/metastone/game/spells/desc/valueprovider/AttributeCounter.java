package net.demilich.metastone.game.spells.desc.valueprovider;

import net.demilich.metastone.game.GameContext;
import net.demilich.metastone.game.Player;
import net.demilich.metastone.game.entities.Entity;
import net.demilich.metastone.game.targeting.EntityReference;
import net.demilich.metastone.game.utils.Attribute;

import java.util.List;

public class AttributeCounter extends ValueProvider {

	public AttributeCounter(ValueProviderDesc desc) {
		super(desc);
	}

	@Override
	protected int provideValue(GameContext context, Player player, Entity target, Entity host) {
		EntityReference source = getDesc().getSource();
		List<Entity> relevantEntities = context.resolveTarget(player, host, source);
		int count = 0;
		Attribute attribute = (Attribute) getDesc().get(ValueProviderArg.ATTRIBUTE);
		for (Entity entity : relevantEntities) {
			if (entity.hasAttribute(attribute)) {
				count++;
			}
		}
		return count;
	}

}
