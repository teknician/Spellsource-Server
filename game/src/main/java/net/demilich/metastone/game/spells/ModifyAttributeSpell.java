package net.demilich.metastone.game.spells;

import com.github.fromage.quasi.fibers.Suspendable;
import net.demilich.metastone.game.GameContext;
import net.demilich.metastone.game.Player;
import net.demilich.metastone.game.entities.Entity;
import net.demilich.metastone.game.spells.desc.SpellArg;
import net.demilich.metastone.game.spells.desc.SpellDesc;
import net.demilich.metastone.game.targeting.EntityReference;
import net.demilich.metastone.game.cards.Attribute;

import java.util.Map;

public class ModifyAttributeSpell extends RevertableSpell {
	public static SpellDesc create(EntityReference target, Attribute tag, int value) {
		Map<SpellArg, Object> arguments = new SpellDesc(ModifyAttributeSpell.class);
		arguments.put(SpellArg.ATTRIBUTE, tag);
		arguments.put(SpellArg.VALUE, value);
		arguments.put(SpellArg.TARGET, target);
		return new SpellDesc(arguments);
	}

	@Override
	protected SpellDesc getReverseSpell(GameContext context, Player player, Entity source, SpellDesc desc, EntityReference target) {
		return ModifyAttributeSpell.create(target, (Attribute) desc.get(SpellArg.ATTRIBUTE), -desc.getValue(SpellArg.VALUE, context, player, context.resolveSingleTarget(target), source, 0));
	}

	@Override
	@Suspendable
	protected void onCast(GameContext context, Player player, SpellDesc desc, Entity source, Entity target) {
		super.onCast(context, player, desc, source, target);
		Attribute attribute = (Attribute) desc.get(SpellArg.ATTRIBUTE);
		int value = desc.getValue(SpellArg.VALUE, context, player, target, source, 0);
		target.modifyAttribute(attribute, value);
	}

}
