package net.pferdimanzug.hearthstone.analyzer.game;

import java.util.ArrayList;
import java.util.List;

import net.pferdimanzug.hearthstone.analyzer.game.behaviour.IBehaviour;
import net.pferdimanzug.hearthstone.analyzer.game.cards.CardCollection;
import net.pferdimanzug.hearthstone.analyzer.game.entities.Entity;
import net.pferdimanzug.hearthstone.analyzer.game.entities.heroes.Hero;
import net.pferdimanzug.hearthstone.analyzer.game.entities.minions.Minion;

public class Player implements Cloneable {

	private final String name;
	private final Hero hero;

	private final CardCollection deck;
	private final CardCollection hand = new CardCollection();
	private final CardCollection graveyard = new CardCollection();
	private final List<Minion> minions = new ArrayList<>();
	
	private int id = -1;

	private int mana;
	private int maxMana;
	
	private IBehaviour behaviour;

	public Player(String name, Hero hero, CardCollection deck) {
		this.name = name;
		this.hero = hero;
		this.deck = deck;
	}
	
	private Player(Player otherPlayer) {
		this.name = otherPlayer.name;
		this.hero = otherPlayer.hero.clone();
		this.deck = otherPlayer.getDeck().clone();
		for (Minion minion : otherPlayer.getMinions()) {
			minions.add(minion.clone());
		}
	}
	
	public IBehaviour getBehaviour() {
		return behaviour;
	}

	public List<Entity> getCharacters() {
		List<Entity> characters = new ArrayList<Entity>();
		characters.add(getHero());
		characters.addAll(getMinions());
		return characters;
	}

	public CardCollection getDeck() {
		return deck;
	}
	
	public CardCollection getGraveyard() {
		return graveyard;
	}

	public CardCollection getHand() {
		return hand;
	}

	public Hero getHero() {
		return hero;
	}

	public int getMana() {
		return mana;
	}
	
	public int getMaxMana() {
		return maxMana;
	}

	public List<Minion> getMinions() {
		return minions;
	}

	public String getName() {
		return "'" + name + "' (" + hero.getName() + ")";
	}

	public void setBehaviour(IBehaviour behaviour) {
		this.behaviour = behaviour;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public void setMaxMana(int maxMana) {
		this.maxMana = maxMana;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Player clone() {
		return new Player(this);
	}

}
