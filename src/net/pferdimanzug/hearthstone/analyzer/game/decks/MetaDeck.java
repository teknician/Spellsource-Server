package net.pferdimanzug.hearthstone.analyzer.game.decks;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import net.pferdimanzug.hearthstone.analyzer.ApplicationFacade;
import net.pferdimanzug.hearthstone.analyzer.game.entities.heroes.HeroClass;
import net.pferdimanzug.hearthstone.analyzer.gui.deckbuilder.DeckProxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MetaDeck extends Deck {

	private static Logger logger = LoggerFactory.getLogger(MetaDeck.class);

	private final List<String> decks;

	public MetaDeck(List<String> decks) {
		super(HeroClass.META);
		this.decks = decks;
	}

	public Deck selectRandom() {
		DeckProxy deckProxy = (DeckProxy) ApplicationFacade.getInstance().retrieveProxy(DeckProxy.NAME);
		String randomEntry = decks.get(ThreadLocalRandom.current().nextInt(decks.size()));
		Deck randomDeck = deckProxy.getDeckByName(randomEntry);
		if (randomDeck == null) {
			logger.error("Deck with name '" + randomEntry + "' referenced in meta deck does not exist any more!");
		}
		return randomDeck;
	}

}
