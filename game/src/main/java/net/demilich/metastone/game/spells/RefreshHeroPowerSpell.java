package net.demilich.metastone.game.spells;

import com.github.fromage.quasi.fibers.Suspendable;
import net.demilich.metastone.game.GameContext;
import net.demilich.metastone.game.Player;
import net.demilich.metastone.game.entities.Entity;
import net.demilich.metastone.game.spells.desc.SpellDesc;
import net.demilich.metastone.game.utils.Attribute;

public class RefreshHeroPowerSpell extends Spell {

	@Override
	@Suspendable
	protected void onCast(GameContext context, Player player, SpellDesc desc, Entity source, Entity target) {
		int heroPowerUsages = player.getHero().getHeroPower().hasBeenUsed();
		player.getHero().setAttribute(Attribute.HERO_POWER_USAGES, heroPowerUsages + 1);
	}
}
