package net.demilich.metastone.game.actions;

import co.paralleluniverse.fibers.Suspendable;
import net.demilich.metastone.game.utils.Attribute;
import net.demilich.metastone.game.GameContext;
import net.demilich.metastone.game.Player;
import net.demilich.metastone.game.entities.Actor;
import net.demilich.metastone.game.entities.Entity;
import net.demilich.metastone.game.entities.EntityType;
import net.demilich.metastone.game.targeting.EntityReference;
import net.demilich.metastone.game.targeting.TargetSelection;

public class PhysicalAttackAction extends GameAction {
	private EntityReference attackerReference;

	private PhysicalAttackAction() {
		setActionType(ActionType.PHYSICAL_ATTACK);
		setTargetRequirement(TargetSelection.ENEMY_CHARACTERS);
		this.attackerReference = EntityReference.NONE;
	}

	public PhysicalAttackAction(EntityReference attackerReference) {
		this();
		this.attackerReference = attackerReference;
	}

	@Override
	public boolean canBeExecutedOn(GameContext context, Player player, Entity entity) {
		if (!super.canBeExecutedOn(context, player, entity)) {
			return false;
		}
		if (entity.getEntityType() != EntityType.HERO) {
			return true;
		}
		Actor attacker = (Actor) context.resolveSingleTarget(attackerReference);
		if (attacker.hasAttribute(Attribute.CANNOT_ATTACK_HEROES) ||
				((attacker.hasAttribute(Attribute.RUSH) || attacker.hasAttribute(Attribute.AURA_RUSH))
						&& attacker.hasAttribute(Attribute.SUMMONING_SICKNESS))) {
			return false;
		}
		return true;
	}

	@Override
	@Suspendable
	public void execute(GameContext context, int playerId) {
		Actor defender = (Actor) context.resolveSingleTarget(getTargetReference());
		Actor attacker = (Actor) context.resolveSingleTarget(attackerReference);

		context.getLogic().fight(context.getPlayer(playerId), attacker, defender, this);
	}

	public EntityReference getAttackerReference() {
		return attackerReference;
	}

	@Override
	public EntityReference getSourceReference() {
		return attackerReference;
	}

	@Override
	public String toString() {
		return String.format("%s Attacker: %s Defender: %s", getActionType(), attackerReference, getTargetReference());
	}

	@Override
	public Entity getSource(GameContext context) {
		return context.resolveSingleTarget(attackerReference);
	}

	@Override
	public String getDescription(GameContext context, int playerId) {
		Actor defender = (Actor) context.resolveSingleTarget(getTargetReference());
		Actor attacker = (Actor) context.resolveSingleTarget(attackerReference);
		return String.format("%s attacked %s.", attacker.getName(), defender.getName());
	}
}
