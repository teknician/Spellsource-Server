package net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warrior;

import net.pferdimanzug.hearthstone.analyzer.game.GameTag;
import net.pferdimanzug.hearthstone.analyzer.game.aura.Aura;
import net.pferdimanzug.hearthstone.analyzer.game.cards.MinionCard;
import net.pferdimanzug.hearthstone.analyzer.game.cards.Rarity;
import net.pferdimanzug.hearthstone.analyzer.game.entities.Actor;
import net.pferdimanzug.hearthstone.analyzer.game.entities.EntityType;
import net.pferdimanzug.hearthstone.analyzer.game.entities.heroes.HeroClass;
import net.pferdimanzug.hearthstone.analyzer.game.entities.minions.Minion;

public class WarsongCommander extends MinionCard {

	private class WarsongCommanderAura extends Aura {

		public WarsongCommanderAura(Actor source) {
			super(source);
		}

		@Override
		public boolean affects(Actor entity) {
			if (entity == getSource()) {
				return false;
			} else if (entity.getOwner() != getSource().getOwner()) {
				return false;
			}
			return entity.getEntityType() == EntityType.MINION;
		}

		@Override
		protected void onApply(Actor entity) {
			entity.setTag(GameTag.CHARGE);
		}

		@Override
		protected void onRemove(Actor entity) {
			entity.removeTag(GameTag.CHARGE);
			
		}
		
	}

	public WarsongCommander() {
		super("Warsong Commander", 2, 3, Rarity.FREE, HeroClass.WARRIOR, 3);
		setDescription("Whenever you summon a minion with 3 or less Attack, give it Charge. ");
	}
	
	@Override
	public Minion summon() {
		Minion warsongCommander = createMinion();
		warsongCommander.setAura(new WarsongCommanderAura(warsongCommander));
		return warsongCommander;
	}
	

}
