package net.pferdimanzug.hearthstone.analyzer.game.spells.desc;

import java.util.HashMap;
import java.util.function.Predicate;

import net.pferdimanzug.hearthstone.analyzer.game.entities.Entity;
import net.pferdimanzug.hearthstone.analyzer.game.logic.CustomCloneable;
import net.pferdimanzug.hearthstone.analyzer.game.spells.IValueProvider;
import net.pferdimanzug.hearthstone.analyzer.game.spells.Spell;
import net.pferdimanzug.hearthstone.analyzer.game.spells.TargetPlayer;
import net.pferdimanzug.hearthstone.analyzer.game.targeting.EntityReference;

public class SpellDesc extends CustomCloneable {

	private final HashMap<SpellArg, Object> arguments = new HashMap<>();
	
	public int assignedGC;

	public SpellDesc() {
	}

	public SpellDesc(Class<? extends Spell> spellClass) {
		this();
		setSpellClass(spellClass);
	}

	@Override
	public SpellDesc clone() {
		SpellDesc clone = new SpellDesc();
		clone.assignedGC = 0;
		for (SpellArg spellArg : arguments.keySet()) {
			Object value = arguments.get(spellArg);
			if (value instanceof CustomCloneable) {
				CustomCloneable cloneable = (CustomCloneable) value;
				clone.set(spellArg, cloneable.clone());
			} else {
				clone.set(spellArg, value);
			}
		}
		return clone;
	}

	public Object get(SpellArg spellArg) {
		return arguments.get(spellArg);
	}
	
	public int getValue() {
		return getInt(SpellArg.VALUE);
	}
	
	public void setValue(int value) {
		set(SpellArg.VALUE, value);
	}

	public int getInt(SpellArg spellArg) {
		return arguments.containsKey(spellArg) ? (int) get(spellArg) : 0;
	}
	
	public boolean getBool(SpellArg spellArg) {
		return arguments.containsKey(spellArg) ? (boolean) get(spellArg) : false;
	}

	public SpellSource getSource() {
		return (SpellSource) arguments.get(SpellArg.SPELL_SOURCE);
	}

	public EntityReference getSourceEntity() {
		return (EntityReference) arguments.get(SpellArg.SOURCE_ENTITY);
	}

	@SuppressWarnings("unchecked")
	public Class<? extends Spell> getSpellClass() {
		return (Class<? extends Spell>) arguments.get(SpellArg.SPELL_CLASS);
	}

	public EntityReference getTarget() {
		return (EntityReference) arguments.get(SpellArg.TARGET);
	}

	public TargetPlayer getTargetPlayer() {
		return (TargetPlayer) get(SpellArg.TARGET_PLAYER);
	}

	public IValueProvider getValueProvider() {
		return (IValueProvider) get(SpellArg.VALUE_PROVIDER);
	}

	public boolean hasPredefinedTarget() {
		if (getTarget() != null) {
			return getTarget().isTargetGroup();
		}
		return false;
	}

	public void set(SpellArg spellArg, Object value) {
		arguments.put(spellArg, value);
	}

	public void setSource(SpellSource source) {
		arguments.put(SpellArg.SPELL_SOURCE, source);
	}

	public void setSourceEntity(EntityReference sourceEntity) {
		arguments.put(SpellArg.SOURCE_ENTITY, sourceEntity);
	}

	public void setSpellClass(Class<? extends Spell> spellClass) {
		arguments.put(SpellArg.SPELL_CLASS, spellClass);
	}

	public void setTarget(EntityReference target) {
		arguments.put(SpellArg.TARGET, target);
	}

	public void setTargetPlayer(TargetPlayer targetPlayer) {
		set(SpellArg.TARGET_PLAYER, targetPlayer);
	}

	public void setValueProvider(IValueProvider valueProvider) {
		set(SpellArg.TARGET_PLAYER, valueProvider);
	}
	
	public void setTargetFilter(Predicate<? extends Entity> targetFilter) {
		set(SpellArg.ENTITY_FILTER, targetFilter);
	}
	
	public void pickRandomTarget(boolean randomTarget) {
		set(SpellArg.RANDOM_TARGET, randomTarget);
	}

	@Override
	public String toString() {
		String result = "[SpellDesc arguments= {\n";
		for (SpellArg spellArg : arguments.keySet()) {
			result += "\t" + spellArg + ": " + arguments.get(spellArg) + "\n";
		}
		result += "}";
		return result;
	}

}
