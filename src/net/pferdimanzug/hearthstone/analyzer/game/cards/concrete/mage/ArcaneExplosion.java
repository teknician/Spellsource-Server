package net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.mage;

import net.pferdimanzug.hearthstone.analyzer.game.actions.TargetSelection;
import net.pferdimanzug.hearthstone.analyzer.game.cards.Rarity;
import net.pferdimanzug.hearthstone.analyzer.game.cards.SpellCard;
import net.pferdimanzug.hearthstone.analyzer.game.entities.heroes.HeroClass;
import net.pferdimanzug.hearthstone.analyzer.game.spells.AreaDamageSpell;

public class ArcaneExplosion extends SpellCard {

	public ArcaneExplosion() {
		super("Arcane Explosion", Rarity.FREE, HeroClass.MAGE, 2);
		setTargetRequirement(TargetSelection.NONE);
		setSpell(new AreaDamageSpell(1, TargetSelection.ENEMY_MINIONS));
	}


}
