package net.demilich.metastone.game.events;

public enum GameEventType {
	ALL,

	AFTER_PHYSICAL_ATTACK,
	AFTER_SPELL_CASTED,
	AFTER_SUMMON,
	ARMOR_GAINED,
	BEFORE_SUMMON,
	BOARD_CHANGED,
	DAMAGE,
	DISCARD,
	DRAW_CARD,
	ENRAGE_CHANGED,
	GAME_START,
	HEAL,
	HERO_POWER_USED,
	JOUST,
	KILL,
	OVERLOAD,
	PHYSICAL_ATTACK,
	PLAY_CARD,
	PRE_DAMAGE,
	REVEAL_CARD,
	SECRET_PLAYED,
	SECRET_REVEALED,
	SPELL_CASTED,
	WILL_END_SEQUENCE,
	SUMMON,
	TARGET_ACQUISITION,
	TURN_END,
	TURN_START,
	SILENCE,
	WEAPON_DESTROYED,
	WEAPON_EQUIPPED,
	MILL,
	QUEST_PLAYED,
	QUEST_SUCCESSFUL,
	LOSE_DEFLECT,
	LOSE_DIVINE_SHIELD,
	ATTRIBUTE_APPLIED,
	MAX_MANA,
	FATIGUE
}
