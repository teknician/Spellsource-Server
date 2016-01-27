package net.demilich.metastone.game.spells;

import java.util.Map;

import net.demilich.metastone.game.Attribute;
import net.demilich.metastone.game.GameContext;
import net.demilich.metastone.game.Player;
import net.demilich.metastone.game.entities.Entity;
import net.demilich.metastone.game.spells.desc.SpellArg;
import net.demilich.metastone.game.spells.desc.SpellDesc;
import net.demilich.metastone.game.spells.desc.valueprovider.ValueProvider;

public class SetAttackSpell extends Spell {

	public static SpellDesc create() {
		Map<SpellArg, Object> arguments = SpellDesc.build(SetAttackSpell.class);
		return new SpellDesc(arguments);
	}

	@Override
	protected void onCast(GameContext context, Player player, SpellDesc desc, Entity source, Entity target) {
		ValueProvider valueProvider = (ValueProvider) desc.get(SpellArg.VALUE_PROVIDER);
		int value = valueProvider != null ? valueProvider.getValue(context, player, target, source) : desc.getValue();
		target.setAttribute(Attribute.ATTACK, value);
		target.removeAttribute(Attribute.TEMPORARY_ATTACK_BONUS);
		target.removeAttribute(Attribute.ATTACK_BONUS);
	}

}