package net.pferdimanzug.hearthstone.analyzer.game.cards;

import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.druid.AncientOfLore;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.druid.AncientOfWar;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.druid.Bite;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.druid.Cenarius;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.druid.Claw;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.druid.DruidOfTheClaw;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.druid.ForceOfNature;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.druid.HealingTouch;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.druid.Innervate;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.druid.IronbarkProtector;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.druid.KeeperOfTheGrove;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.druid.MarkOfNature;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.druid.MarkOfTheWild;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.druid.Moonfire;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.druid.Naturalize;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.druid.Nourish;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.druid.PowerOfTheWild;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.druid.SavageRoar;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.druid.Savagery;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.druid.SoulOfTheForest;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.druid.Starfall;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.druid.Starfire;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.druid.Swipe;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.druid.WildGrowth;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.druid.Wrath;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.hunter.AnimalCompanion;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.hunter.ArcaneShot;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.hunter.BestialWrath;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.hunter.DeadlyShot;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.hunter.EaglehornBow;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.hunter.ExplosiveShot;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.hunter.ExplosiveTrap;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.hunter.Flare;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.hunter.FreezingTrap;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.hunter.GladiatorsLongbow;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.hunter.Houndmaster;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.hunter.HuntersMark;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.hunter.KillCommand;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.hunter.KingKrush;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.hunter.Misdirection;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.hunter.MultiShot;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.hunter.SavannahHighmane;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.hunter.ScavengingHyena;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.hunter.SnakeTrap;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.hunter.Snipe;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.hunter.StarvingBuzzard;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.hunter.TimberWolf;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.hunter.Tracking;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.hunter.TundraRhino;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.hunter.UnleashTheHounds;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.mage.ArcaneExplosion;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.mage.ArcaneIntellect;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.mage.ArcaneMissiles;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.mage.ArchmageAntonidas;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.mage.Blizzard;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.mage.ConeOfCold;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.mage.Counterspell;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.mage.EtherealArcanist;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.mage.Fireball;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.mage.Flamestrike;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.mage.FrostNova;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.mage.Frostbolt;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.mage.IceBarrier;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.mage.IceBlock;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.mage.IceLance;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.mage.KirinTorMage;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.mage.ManaWyrm;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.mage.MirrorEntity;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.mage.MirrorImage;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.mage.Polymorph;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.mage.Pyroblast;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.mage.SorcerersApprentice;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.mage.Spellbender;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.mage.Vaporize;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.mage.WaterElemental;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.neutral.*;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.paladin.AldorPeacekeeper;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.paladin.ArgentProtector;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.paladin.AvengingWrath;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.paladin.BlessedChampion;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.paladin.BlessingOfKings;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.paladin.BlessingOfMight;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.paladin.BlessingOfWisdom;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.paladin.Consecration;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.paladin.DivineFavor;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.paladin.Equality;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.paladin.EyeForAnEye;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.paladin.GuardianOfKings;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.paladin.HammerOfWrath;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.paladin.HandOfProtection;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.paladin.HolyLight;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.paladin.HolyWrath;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.paladin.Humility;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.paladin.LayOnHands;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.paladin.LightsJustice;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.paladin.NobleSacrifice;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.paladin.Redemption;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.paladin.Repentance;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.paladin.SwordOfJustice;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.paladin.TirionFordring;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.paladin.TruesilverChampion;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.priest.AuchenaiSoulpriest;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.priest.CabalShadowPriest;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.priest.CircleOfHealing;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.priest.DivineSpirit;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.priest.HolyFire;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.priest.HolyNova;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.priest.HolySmite;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.priest.InnerFire;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.priest.Lightspawn;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.priest.Lightwell;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.priest.MassDispel;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.priest.MindBlast;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.priest.MindControl;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.priest.MindVision;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.priest.Mindgames;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.priest.NorthshireCleric;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.priest.PowerWordShield;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.priest.ProphetVelen;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.priest.ShadowMadness;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.priest.ShadowWordDeath;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.priest.ShadowWordPain;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.priest.Shadowform;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.priest.Silence;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.priest.TempleEnforcer;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.priest.Thoughtsteal;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.rogue.Assassinate;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.rogue.AssassinsBlade;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.rogue.Backstab;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.rogue.Betrayal;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.rogue.BladeFlurry;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.rogue.ColdBlood;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.rogue.Conceal;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.rogue.DeadlyPoison;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.rogue.DefiasRingleader;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.rogue.EdwinVanCleef;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.rogue.Eviscerate;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.rogue.FanOfKnives;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.rogue.Headcrack;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.rogue.Kidnapper;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.rogue.MasterOfDisguise;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.rogue.PatientAssassin;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.rogue.PerditionsBlade;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.rogue.Preparation;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.rogue.SI7Agent;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.rogue.Sap;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.rogue.Shadowstep;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.rogue.Shiv;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.rogue.SinisterStrike;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.rogue.Sprint;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.rogue.Vanish;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.shaman.AlAkirTheWindlord;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.shaman.AncestralHealing;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.shaman.AncestralSpirit;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.shaman.Bloodlust;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.shaman.Doomhammer;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.shaman.DustDevil;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.shaman.EarthElemental;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.shaman.EarthShock;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.shaman.FarSight;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.shaman.FeralSpirit;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.shaman.FireElemental;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.shaman.FlametongueTotem;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.shaman.ForkedLightning;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.shaman.FrostShock;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.shaman.Hex;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.shaman.LavaBurst;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.shaman.LightningBolt;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.shaman.LightningStorm;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.shaman.ManaTideTotem;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.shaman.RockbiterWeapon;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.shaman.StormforgedAxe;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.shaman.TotemicMight;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.shaman.UnboundElemental;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.shaman.Windfury;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.shaman.Windspeaker;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warlock.BaneOfDoom;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warlock.BloodImp;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warlock.Corruption;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warlock.Demonfire;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warlock.Doomguard;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warlock.DrainLife;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warlock.DreadInfernal;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warlock.Felguard;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warlock.FlameImp;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warlock.Hellfire;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warlock.LordJaraxxus;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warlock.MortalCoil;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warlock.PitLord;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warlock.PowerOverwhelming;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warlock.SacrificialPact;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warlock.SenseDemons;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warlock.ShadowBolt;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warlock.Shadowflame;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warlock.SiphonSoul;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warlock.Soulfire;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warlock.Succubus;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warlock.SummoningPortal;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warlock.TwistingNether;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warlock.VoidTerror;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warlock.Voidwalker;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warrior.ArathiWeaponsmith;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warrior.ArcaniteReaper;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warrior.Armorsmith;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warrior.BattleRage;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warrior.Brawl;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warrior.Charge;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warrior.Cleave;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warrior.CommandingShout;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warrior.CruelTaskmaster;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warrior.Execute;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warrior.FieryWarAxe;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warrior.FrothingBerserker;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warrior.Gorehowl;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warrior.GrommashHellscream;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warrior.HeroicStrike;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warrior.InnerRage;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warrior.KorkronElite;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warrior.MortalStrike;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warrior.Rampage;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warrior.ShieldBlock;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warrior.ShieldSlam;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warrior.Slam;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warrior.Upgrade;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warrior.WarsongCommander;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warrior.Whirlwind;
import net.pferdimanzug.hearthstone.analyzer.game.entities.heroes.HeroClass;

public class CardCatalogue {

	public static Card getCardByName(String name) {
		for (Card card : cards) {
			if (card.getName().equals(name)) {
				return card.clone();
			}
		}

		return null;
	}

	public static CardCollection query(CardType cardType, Rarity rarity, HeroClass heroClass) {
		CardCollection result = new CardCollection();
		for (Card card : cards) {
			if (!card.isCollectible()) {
				continue;
			}
			if (cardType != null && card.getCardType() != cardType) {
				continue;
			}
			if (rarity != null && card.getRarity() != rarity) {
				continue;
			}
			if (heroClass != null && card.getClassRestriction() != heroClass) {
				continue;
			}
			result.add(card.clone());
		}

		return result;
	}
	
	public static CardCollection getAll() {
		CardCollection result = new CardCollection();
		for (Card card : cards) {
			result.add(card);
		}
		return result;
	}

	private final static CardCollection cards = new CardCollection();
	static {
		cards.add(new AncientOfLore());
		cards.add(new AncientOfWar());
		cards.add(new Bite());
		cards.add(new Cenarius());
		cards.add(new Claw());
		cards.add(new DruidOfTheClaw());
		cards.add(new ForceOfNature());
		cards.add(new HealingTouch());
		cards.add(new Innervate());
		cards.add(new IronbarkProtector());
		cards.add(new KeeperOfTheGrove());
		cards.add(new MarkOfNature());
		cards.add(new MarkOfTheWild());
		cards.add(new Moonfire());
		cards.add(new Naturalize());
		cards.add(new Nourish());
		cards.add(new PowerOfTheWild());
		cards.add(new SavageRoar());
		cards.add(new Savagery());
		cards.add(new SoulOfTheForest());
		cards.add(new Starfall());
		cards.add(new Starfire());
		cards.add(new Swipe());
		cards.add(new WildGrowth());
		cards.add(new Wrath());
		cards.add(new AnimalCompanion());
		cards.add(new ArcaneShot());
		cards.add(new BestialWrath());
		cards.add(new DeadlyShot());
		cards.add(new EaglehornBow());
		cards.add(new ExplosiveShot());
		cards.add(new ExplosiveTrap());
		cards.add(new Flare());
		cards.add(new FreezingTrap());
		cards.add(new GladiatorsLongbow());
		cards.add(new Houndmaster());
		cards.add(new HuntersMark());
		cards.add(new KillCommand());
		cards.add(new KingKrush());
		cards.add(new Misdirection());
		cards.add(new MultiShot());
		cards.add(new SavannahHighmane());
		cards.add(new ScavengingHyena());
		cards.add(new SnakeTrap());
		cards.add(new Snipe());
		cards.add(new StarvingBuzzard());
		cards.add(new TimberWolf());
		cards.add(new Tracking());
		cards.add(new TundraRhino());
		cards.add(new UnleashTheHounds());
		cards.add(new ArcaneExplosion());
		cards.add(new ArcaneIntellect());
		cards.add(new ArcaneMissiles());
		cards.add(new ArchmageAntonidas());
		cards.add(new Blizzard());
		cards.add(new ConeOfCold());
		cards.add(new Counterspell());
		cards.add(new EtherealArcanist());
		cards.add(new Fireball());
		cards.add(new Flamestrike());
		cards.add(new Frostbolt());
		cards.add(new FrostNova());
		cards.add(new IceBarrier());
		cards.add(new IceBlock());
		cards.add(new IceLance());
		cards.add(new KirinTorMage());
		cards.add(new ManaWyrm());
		cards.add(new MirrorEntity());
		cards.add(new MirrorImage());
		cards.add(new Polymorph());
		cards.add(new Pyroblast());
		cards.add(new SorcerersApprentice());
		cards.add(new Spellbender());
		cards.add(new Vaporize());
		cards.add(new WaterElemental());
		cards.add(new Abomination());
		cards.add(new AbusiveSergeant());
		cards.add(new AcidicSwampOoze());
		cards.add(new AcolyteOfPain());
		cards.add(new AlarmOBot());
		cards.add(new Alexstrasza());
		cards.add(new AmaniBerserker());
		cards.add(new AncientBrewmaster());
		cards.add(new AncientMage());
		cards.add(new AncientWatcher());
		cards.add(new AngryChicken());
		cards.add(new ArcaneGolem());
		cards.add(new Archmage());
		cards.add(new ArgentCommander());
		cards.add(new ArgentSquire());
		cards.add(new AzureDrake());
		cards.add(new BaronGeddon());
		cards.add(new BigGameHunter());
		cards.add(new BloodfenRaptor());
		cards.add(new BloodKnight());
		cards.add(new BloodmageThalnos());
		cards.add(new BloodsailCorsair());
		cards.add(new BloodsailRaider());
		cards.add(new BluegillWarrior());
		cards.add(new BootyBayBodyguard());
		cards.add(new BoulderfistOgre());
		cards.add(new CairneBloodhoof());
		cards.add(new CaptainGreenskin());
		cards.add(new CaptainsParrot());
		cards.add(new ChillwindYeti());
		cards.add(new ColdlightOracle());
		cards.add(new ColdlightSeer());
		cards.add(new CoreHound());
		cards.add(new CrazedAlchemist());
		cards.add(new CultMaster());
		cards.add(new DalaranMage());
		cards.add(new DarkIronDwarf());
		cards.add(new DarkscaleHealer());
		cards.add(new Deathwing());
		cards.add(new DefenderOfArgus());
		cards.add(new Demolisher());
		cards.add(new DireWolfAlpha());
		cards.add(new Doomsayer());
		cards.add(new DragonlingMechanic());
		cards.add(new DreadCorsair());
		cards.add(new EarthenRingFarseer());
		cards.add(new EliteTaurenChieftain());
		cards.add(new ElvenArcher());
		cards.add(new EmperorCobra());
		cards.add(new FacelessManipulator());
		cards.add(new FaerieDragon());
		cards.add(new FenCreeper());
		cards.add(new FlesheatingGhoul());
		cards.add(new FrostElemental());
		cards.add(new FrostwolfGrunt());
		cards.add(new FrostwolfWarlord());
		cards.add(new GadgetzanAuctioneer());
		cards.add(new GelbinMekkatorque());
		cards.add(new GnomishInventor());
		cards.add(new GoldshireFootman());
		cards.add(new GrimscaleOracle());
		cards.add(new Gruul());
		cards.add(new GurubashiBerserker());
		cards.add(new HarrisonJones());
		cards.add(new HarvestGolem());
		cards.add(new Hogger());
		cards.add(new HungryCrab());
		cards.add(new IllidanStormrage());
		cards.add(new ImpMaster());
		cards.add(new InjuredBlademaster());
		cards.add(new IronbeakOwl());
		cards.add(new IronforgeRifleman());
		cards.add(new IronfurGrizzly());
		cards.add(new JunglePanther());
		cards.add(new KingMukla());
		cards.add(new KnifeJuggler());
		cards.add(new KoboldGeomancer());
		cards.add(new LeeroyJenkins());
		cards.add(new LeperGnome());
		cards.add(new Lightwarden());
		cards.add(new LootHoarder());
		cards.add(new LordOfTheArena());
		cards.add(new LorewalkerCho());
		cards.add(new MadBomber());
		cards.add(new MagmaRager());
		cards.add(new Malygos());
		cards.add(new ManaAddict());
		cards.add(new ManaWraith());
		cards.add(new MasterSwordsmith());
		cards.add(new MillhouseManastorm());
		cards.add(new MindControlTech());
		cards.add(new MogushanWarden());
		cards.add(new MoltenGiant());
		cards.add(new MountainGiant());
		cards.add(new MurlocRaider());
		cards.add(new MurlocTidecaller());
		cards.add(new MurlocTidehunter());
		cards.add(new MurlocWarleader());
		cards.add(new NatPagle());
		cards.add(new Nightblade());
		cards.add(new NoviceEngineer());
		cards.add(new Nozdormu());
		cards.add(new OasisSnapjaw());
		cards.add(new OgreMagi());
		cards.add(new OldMurkEye());
		cards.add(new Onyxia());
		cards.add(new PintSizedSummoner());
		cards.add(new PriestessOfElune());
		cards.add(new QuestingAdventurer());
		cards.add(new RagingWorgen());
		cards.add(new RagnarosTheFirelord());
		cards.add(new RaidLeader());
		cards.add(new RavenholdtAssassin());
		cards.add(new RazorfenHunter());
		cards.add(new RecklessRocketeer());
		cards.add(new RiverCrocolisk());
		cards.add(new ScarletCrusader());
		cards.add(new SeaGiant());
		cards.add(new Secretkeeper());
		cards.add(new SenjinShieldmasta());
		cards.add(new ShatteredSunCleric());
		cards.add(new Shieldbearer());
		cards.add(new SilverbackPatriarch());
		cards.add(new SilverHandKnight());
		cards.add(new SilvermoonGuardian());
		cards.add(new SouthseaCaptain());
		cards.add(new SouthseaDeckhand());
		cards.add(new Spellbreaker());
		cards.add(new SpitefulSmith());
		cards.add(new StampedingKodo());
		cards.add(new StonetuskBoar());
		cards.add(new StormpikeCommando());
		cards.add(new StormwindChampion());
		cards.add(new StormwindKnight());
		cards.add(new StranglethornTiger());
		cards.add(new SunfuryProtector());
		cards.add(new Sunwalker());
		cards.add(new SylvanasWindrunner());
		cards.add(new TaurenWarrior());
		cards.add(new TheBeast());
		cards.add(new TheBlackKnight());
		cards.add(new TheCoin());
		cards.add(new ThrallmarFarseer());
		cards.add(new TinkmasterOverspark());
		cards.add(new TwilightDrake());
		cards.add(new VentureCoMercenary());
		cards.add(new VioletTeacher());
		cards.add(new VoodooDoctor());
		cards.add(new WarGolem());
		cards.add(new WildPyromancer());
		cards.add(new WindfuryHarpy());
		cards.add(new Wisp());
		cards.add(new Wolfrider());
		cards.add(new WorgenInfiltrator());
		cards.add(new YoungDragonhawk());
		cards.add(new YoungPriestess());
		cards.add(new YouthfulBrewmaster());
		cards.add(new Ysera());
		cards.add(new AldorPeacekeeper());
		cards.add(new ArgentProtector());
		cards.add(new AvengingWrath());
		cards.add(new BlessedChampion());
		cards.add(new BlessingOfKings());
		cards.add(new BlessingOfMight());
		cards.add(new BlessingOfWisdom());
		cards.add(new Consecration());
		cards.add(new DivineFavor());
		cards.add(new Equality());
		cards.add(new EyeForAnEye());
		cards.add(new GuardianOfKings());
		cards.add(new HammerOfWrath());
		cards.add(new HandOfProtection());
		cards.add(new HolyLight());
		cards.add(new HolyWrath());
		cards.add(new Humility());
		cards.add(new LayOnHands());
		cards.add(new LightsJustice());
		cards.add(new NobleSacrifice());
		cards.add(new Redemption());
		cards.add(new Repentance());
		cards.add(new SwordOfJustice());
		cards.add(new TirionFordring());
		cards.add(new TruesilverChampion());
		cards.add(new AuchenaiSoulpriest());
		cards.add(new CabalShadowPriest());
		cards.add(new CircleOfHealing());
		cards.add(new DivineSpirit());
		cards.add(new HolyFire());
		cards.add(new HolyNova());
		cards.add(new HolySmite());
		cards.add(new InnerFire());
		cards.add(new Lightspawn());
		cards.add(new Lightwell());
		cards.add(new MassDispel());
		cards.add(new MindBlast());
		cards.add(new MindControl());
		cards.add(new Mindgames());
		cards.add(new MindVision());
		cards.add(new NorthshireCleric());
		cards.add(new PowerWordShield());
		cards.add(new ProphetVelen());
		cards.add(new Shadowform());
		cards.add(new ShadowMadness());
		cards.add(new ShadowWordDeath());
		cards.add(new ShadowWordPain());
		cards.add(new Silence());
		cards.add(new TempleEnforcer());
		cards.add(new Thoughtsteal());
		cards.add(new Assassinate());
		cards.add(new AssassinsBlade());
		cards.add(new Backstab());
		cards.add(new Betrayal());
		cards.add(new BladeFlurry());
		cards.add(new ColdBlood());
		cards.add(new Conceal());
		cards.add(new DeadlyPoison());
		cards.add(new DefiasRingleader());
		cards.add(new EdwinVanCleef());
		cards.add(new Eviscerate());
		cards.add(new FanOfKnives());
		cards.add(new Headcrack());
		cards.add(new Kidnapper());
		cards.add(new MasterOfDisguise());
		cards.add(new PatientAssassin());
		cards.add(new PerditionsBlade());
		cards.add(new Preparation());
		cards.add(new Sap());
		cards.add(new Shadowstep());
		cards.add(new Shiv());
		cards.add(new SI7Agent());
		cards.add(new SinisterStrike());
		cards.add(new Sprint());
		cards.add(new Vanish());
		cards.add(new AlAkirTheWindlord());
		cards.add(new AncestralHealing());
		cards.add(new AncestralSpirit());
		cards.add(new Bloodlust());
		cards.add(new Doomhammer());
		cards.add(new DustDevil());
		cards.add(new EarthElemental());
		cards.add(new EarthShock());
		cards.add(new FarSight());
		cards.add(new FeralSpirit());
		cards.add(new FireElemental());
		cards.add(new FlametongueTotem());
		cards.add(new ForkedLightning());
		cards.add(new FrostShock());
		cards.add(new Hex());
		cards.add(new LavaBurst());
		cards.add(new LightningBolt());
		cards.add(new LightningStorm());
		cards.add(new ManaTideTotem());
		cards.add(new RockbiterWeapon());
		cards.add(new StormforgedAxe());
		cards.add(new TotemicMight());
		cards.add(new UnboundElemental());
		cards.add(new Windfury());
		cards.add(new Windspeaker());
		cards.add(new BaneOfDoom());
		cards.add(new BloodImp());
		cards.add(new Corruption());
		cards.add(new Demonfire());
		cards.add(new Doomguard());
		cards.add(new DrainLife());
		cards.add(new DreadInfernal());
		cards.add(new Felguard());
		cards.add(new FlameImp());
		cards.add(new Hellfire());
		cards.add(new LordJaraxxus());
		cards.add(new MortalCoil());
		cards.add(new PitLord());
		cards.add(new PowerOverwhelming());
		cards.add(new SacrificialPact());
		cards.add(new SenseDemons());
		cards.add(new ShadowBolt());
		cards.add(new Shadowflame());
		cards.add(new SiphonSoul());
		cards.add(new Soulfire());
		cards.add(new Succubus());
		cards.add(new SummoningPortal());
		cards.add(new TwistingNether());
		cards.add(new VoidTerror());
		cards.add(new Voidwalker());
		cards.add(new ArathiWeaponsmith());
		cards.add(new ArcaniteReaper());
		cards.add(new Armorsmith());
		cards.add(new BattleRage());
		cards.add(new Brawl());
		cards.add(new Charge());
		cards.add(new Cleave());
		cards.add(new CommandingShout());
		cards.add(new CruelTaskmaster());
		cards.add(new Execute());
		cards.add(new FieryWarAxe());
		cards.add(new FrothingBerserker());
		cards.add(new Gorehowl());
		cards.add(new GrommashHellscream());
		cards.add(new HeroicStrike());
		cards.add(new InnerRage());
		cards.add(new KorkronElite());
		cards.add(new MortalStrike());
		cards.add(new Rampage());
		cards.add(new ShieldBlock());
		cards.add(new ShieldSlam());
		cards.add(new Slam());
		cards.add(new Upgrade());
		cards.add(new WarsongCommander());
		cards.add(new Whirlwind());
	}

}
