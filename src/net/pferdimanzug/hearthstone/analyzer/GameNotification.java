package net.pferdimanzug.hearthstone.analyzer;

public enum GameNotification {
	APPLICATION_STARTUP,
	CANVAS_CREATED,
	SHOW_VIEW,
	START_GAME,
	GAME_STATE_UPDATE,
	GAME_ACTION_PERFORMED,
	GAME_OVER,
	BATCH_START,
	BATCH_STOP,
	HUMAN_PROMPT_FOR_ACTION,
	HUMAN_PROMPT_FOR_TARGET,
	
	PLAY_MODE_SELECTED,
	DECK_BUILDER_SELECTED,
	
	LOAD_DECKS,
	DECKS_LOADED,
	CREATE_NEW_DECK,
	CLASS_CHOSEN,
	EDIT_DECK,
	ACTIVE_DECK_CHANGED,
	FILTERED_CARDS,
	ADD_CARD_TO_DECK,
	REMOVE_CARD_FROM_DECK,
	DECK_COMPLETED
}
