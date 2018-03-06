package net.demilich.metastone.game.spells;

import co.paralleluniverse.fibers.Suspendable;
import net.demilich.metastone.game.GameContext;
import net.demilich.metastone.game.Player;
import net.demilich.metastone.game.entities.Entity;
import net.demilich.metastone.game.spells.desc.SpellArg;
import net.demilich.metastone.game.spells.desc.SpellDesc;
import net.demilich.metastone.game.spells.desc.condition.Condition;

/**
 * Casts the {@link SpellArg#SPELL} if the {@link Condition} in {@link SpellArg#CONDITION} is met; or, when a {@link
 * SpellArg#SPELLS} array is specified, casts the spell in the array if its corresponding {@link SpellArg#CONDITIONS}
 * array member is met.
 * <p>
 * The {@link Condition} in {@link SpellArg#CONDITION} or {@link SpellArg#CONDITIONS} is evaluated against this spell
 * invocation's {@code target}. This means that, for example, an {@link net.demilich.metastone.game.spells.desc.condition.IsDeadCondition}
 * will be evaluated against the target of this spell.
 * <p>
 * For <b>example</b>, this spell implements, "If you're holding a Dragon, deal 3 damage to all minions":
 * <pre>
 *     {
 *          "class": "ConditionalSpell",
 *          "condition": {
 *              "class": "HoldsCardCondition",
 *              "cardFilter": {
 *                  "class": "CardFilter",
 *                  "race": "DRAGON"
 *              }
 *          },
 *          "spell": {
 *              "class": "DamageSpell",
 *              "target": "ALL_MINIONS",
 *              "value": 3
 *          }
 *      }
 * </pre>
 * To handle multiple possible conditions, consider "If you're a Hunter, draw a Beast. If you're a Paladin, draw a
 * Murloc." Observe that the first condition in the array of conditions corresponds to the first spell in the array of
 * spells, indicating that the first condition, if met, should cast the first spell. Likewise for the second spell:
 * <pre>
 *     {
 *         "class": "ConditionalSpell",
 *         "conditions": [
 *              {
 *                  "class": "HeroClassCondition"
 *                  "targetPlayer": "SELF",
 *                  "heroClass": "GREEN"
 *              },
 *              {
 *                  "class": "HeroClassCondition"
 *                  "targetPlayer": "SELF",
 *                  "heroClass": "GOLD"
 *              }
 *         ],
 *         "spells": [
 *              {
 *                  "class": "FromDeckToHandSpell",
 *                  "value": 1,
 *                  "cardFilter": {
 *                      "class": "CardFilter",
 *                      "cardType": "MINION",
 *                      "race": "BEAST"
 *                  },
 *                  "targetPlayer": "SELF"
 *              },
 *              {
 *                  "class": "FromDeckToHandSpell",
 *                  "value": 1,
 *                  "cardFilter": {
 *                      "class": "CardFilter",
 *                      "cardType": "MINION",
 *                      "race": "MURLOC"
 *                  },
 *                  "targetPlayer": "SELF"
 *              }
 *         ]
 *     }
 * </pre>
 *
 * @see ConditionalEffectSpell to add an additional effect to a spell, giving you a default behaviour when the condition
 * fails.
 * @see EitherOrSpell to perform a binary effect: one spell if the condition is true, and a different spell if the
 * condition is false.
 */
public class ConditionalSpell extends Spell {

	@Override
	@Suspendable
	protected void onCast(GameContext context, Player player, SpellDesc desc, Entity source, Entity target) {
		// case 1 - only one condition
		Condition condition = (Condition) desc.get(SpellArg.CONDITION);
		if (condition != null) {
			SpellDesc spell = (SpellDesc) desc.get(SpellArg.SPELL);
			if (condition.isFulfilled(context, player, source, target)) {
				SpellUtils.castChildSpell(context, player, spell, source, target);
			}
			return;
		}

		// case 2 - multiple conditions and multiple spells
		Condition[] conditions = (Condition[]) desc.get(SpellArg.CONDITIONS);
		SpellDesc[] spells = (SpellDesc[]) desc.get(SpellArg.SPELLS);
		for (int i = 0; i < conditions.length; i++) {
			if (conditions[i].isFulfilled(context, player, source, target)) {
				SpellUtils.castChildSpell(context, player, spells[i], source, target);
			}
		}
	}

}
