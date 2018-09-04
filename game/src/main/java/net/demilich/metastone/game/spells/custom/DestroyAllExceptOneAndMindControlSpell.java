package net.demilich.metastone.game.spells.custom;

import com.github.fromage.quasi.fibers.Suspendable;
import net.demilich.metastone.game.GameContext;
import net.demilich.metastone.game.Player;
import net.demilich.metastone.game.entities.Entity;
import net.demilich.metastone.game.entities.minions.Minion;
import net.demilich.metastone.game.spells.DestroyAllExceptOneSpell;
import net.demilich.metastone.game.spells.DestroySpell;
import net.demilich.metastone.game.spells.SpellUtils;
import net.demilich.metastone.game.spells.desc.SpellDesc;
import net.demilich.metastone.game.spells.desc.filter.EntityFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by finaris on 1/26/17.
 */

public class DestroyAllExceptOneAndMindControlSpell extends DestroySpell {

    public static Logger logger = LoggerFactory.getLogger(DestroyAllExceptOneSpell.class);

    @Override
    @Suspendable
    public void cast(GameContext context, Player player, SpellDesc desc, Entity source, List<Entity> targets) {
        if (targets == null || targets.isEmpty()) {
            return;
        }
        EntityFilter filter = desc.getEntityFilter();
        List<Entity> destroyedTargets = new ArrayList<>(targets);
        List<Entity> potentialSurvivors = SpellUtils.getValidTargets(context, player, destroyedTargets, filter);
        if (!potentialSurvivors.isEmpty()) {
            Entity randomTarget = context.getLogic().getRandom(potentialSurvivors);
            destroyedTargets.remove(randomTarget);
            Minion minion = (Minion) randomTarget;
            context.getLogic().mindControl(player, minion);
        }

        for (Entity entity : destroyedTargets) {
            onCast(context, player, null, null, entity);
        }
    }

}
