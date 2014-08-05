package net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.druid;

import net.pferdimanzug.hearthstone.analyzer.game.GameContext;
import net.pferdimanzug.hearthstone.analyzer.game.Player;
import net.pferdimanzug.hearthstone.analyzer.game.cards.Rarity;
import net.pferdimanzug.hearthstone.analyzer.game.cards.SpellCard;
import net.pferdimanzug.hearthstone.analyzer.game.entities.Entity;
import net.pferdimanzug.hearthstone.analyzer.game.entities.heroes.HeroClass;
import net.pferdimanzug.hearthstone.analyzer.game.logic.GameLogic;
import net.pferdimanzug.hearthstone.analyzer.game.spells.DrawCardSpell;
import net.pferdimanzug.hearthstone.analyzer.game.spells.Spell;
import net.pferdimanzug.hearthstone.analyzer.game.targeting.TargetSelection;

public class WildGrowth extends SpellCard {

	public WildGrowth() {
		super("Wild Growth", Rarity.FREE, HeroClass.DRUID, 2);
		setDescription("Gain an empty Mana Crystal.");
		setSpell(new WildGrowthSpell());
		setTargetRequirement(TargetSelection.NONE);
	}

	@Override
	public int getTypeId() {
		return 24;
	}

	private class ExcessManaCard extends SpellCard {

		public ExcessManaCard() {
			super("Excess Mana", Rarity.FREE, HeroClass.DRUID, 0);
			setDescription("Draw a card. (You can only have 10 Mana in your tray.)");
			setCollectible(false);
			setSpell(new DrawCardSpell(1));
			setTargetRequirement(TargetSelection.NONE);
		}

	}



	private class WildGrowthSpell extends Spell {

		@Override
		protected void onCast(GameContext context, Player player, Entity target) {
			if (player.getMaxMana() < GameLogic.MAX_MANA) {
				context.getLogic().modifyMaxMana(player, +1);
			} else {
				context.getLogic().receiveCard(player.getId(), new ExcessManaCard());
			}

		}
	}
}
