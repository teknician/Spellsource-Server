package net.demilich.metastone.game.cards.concrete.mage;

import net.demilich.metastone.game.GameTag;
import net.demilich.metastone.game.cards.Rarity;
import net.demilich.metastone.game.cards.SecretCard;
import net.demilich.metastone.game.entities.heroes.HeroClass;
import net.demilich.metastone.game.spells.AddAttributeSpell;
import net.demilich.metastone.game.spells.desc.SpellDesc;
import net.demilich.metastone.game.spells.trigger.HeroFatalDamageTrigger;
import net.demilich.metastone.game.spells.trigger.TurnStartTrigger;
import net.demilich.metastone.game.spells.trigger.secrets.Secret;
import net.demilich.metastone.game.targeting.EntityReference;

public class IceBlock extends SecretCard {

	public IceBlock() {
		super("Ice Block", Rarity.EPIC, HeroClass.MAGE, 3);
		setDescription("Secret: When your hero takes fatal damage, prevent it and become Immune this turn.");
		
		SpellDesc iceBlockSpell = AddAttributeSpell.create(EntityReference.FRIENDLY_HERO, GameTag.IMMUNE, new TurnStartTrigger(null));
		setSecret(new Secret(new HeroFatalDamageTrigger(null), iceBlockSpell, this));
	}

	@Override
	public int getTypeId() {
		return 64;
	}
}
