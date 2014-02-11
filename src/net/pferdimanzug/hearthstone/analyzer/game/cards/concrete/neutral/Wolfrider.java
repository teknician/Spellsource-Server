package net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.neutral;

import net.pferdimanzug.hearthstone.analyzer.game.GameTag;
import net.pferdimanzug.hearthstone.analyzer.game.cards.MinionCard;
import net.pferdimanzug.hearthstone.analyzer.game.cards.Rarity;
import net.pferdimanzug.hearthstone.analyzer.game.entities.heroes.HeroClass;
import net.pferdimanzug.hearthstone.analyzer.game.entities.minions.Minion;

public class Wolfrider extends MinionCard {

	public Wolfrider() {
		super("Wolfrider", 3, 1, Rarity.FREE, HeroClass.ANY, 3);
		setDescription("Charge");
	}

	@Override
	public Minion summon() {
		return createMinion(GameTag.CHARGE);
	}

}
