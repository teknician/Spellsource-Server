package net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.neutral;

import net.pferdimanzug.hearthstone.analyzer.game.GameTag;
import net.pferdimanzug.hearthstone.analyzer.game.actions.Battlecry;
import net.pferdimanzug.hearthstone.analyzer.game.cards.MinionCard;
import net.pferdimanzug.hearthstone.analyzer.game.cards.Rarity;
import net.pferdimanzug.hearthstone.analyzer.game.entities.heroes.HeroClass;
import net.pferdimanzug.hearthstone.analyzer.game.entities.minions.Minion;
import net.pferdimanzug.hearthstone.analyzer.game.spells.DamageSpell;
import net.pferdimanzug.hearthstone.analyzer.game.targeting.TargetSelection;

public class StormpikeCommando extends MinionCard {
	
	public StormpikeCommando() {
		super("Stormpike Commando", 4, 2, Rarity.FREE, HeroClass.ANY, 5);
		setDescription("Battlecry: Deal 2 damage.");
	}

	@Override
	public Minion summon() {
		Minion stormpikeCommando = createMinion();
		Battlecry battlecry = Battlecry.createBattlecry(new DamageSpell(2), TargetSelection.ANY);
		stormpikeCommando.setTag(GameTag.BATTLECRY, battlecry);
		return stormpikeCommando;
	}

}
