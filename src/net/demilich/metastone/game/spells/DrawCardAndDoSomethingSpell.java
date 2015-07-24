package net.demilich.metastone.game.spells;

import net.demilich.metastone.game.GameContext;
import net.demilich.metastone.game.Player;
import net.demilich.metastone.game.cards.Card;
import net.demilich.metastone.game.entities.Entity;
import net.demilich.metastone.game.spells.desc.SpellArg;
import net.demilich.metastone.game.spells.desc.SpellDesc;
import net.demilich.metastone.game.targeting.CardLocation;
import net.demilich.metastone.game.targeting.EntityReference;

public class DrawCardAndDoSomethingSpell extends Spell {
	
	@Override
	protected void onCast(GameContext context, Player player, SpellDesc desc, Entity source, Entity target) {
		int amount = desc.getInt(SpellArg.VALUE, 1);
		for (int i = 0; i < amount; i++) {
			Card card = context.getLogic().drawCard(player.getId());
			// card may be null (i.e. try to draw from deck, but already in fatigue)
			if (card == null || card.getLocation() == CardLocation.GRAVEYARD) {
				return;
			}
			SpellDesc cardEffectSpell = (SpellDesc) desc.get(SpellArg.SPELL_1);
			EntityReference sourceReference = source != null ? source.getReference() : null; 
			context.getLogic().castSpell(player.getId(), cardEffectSpell, sourceReference, card.getReference());
		}
	}

}
