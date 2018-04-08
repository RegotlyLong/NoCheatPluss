/*
 * This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package fr.neatmonster.nocheatplus.actions.types.penalty.fight;

import org.bukkit.event.entity.EntityDamageByEntityEvent;

import fr.neatmonster.nocheatplus.actions.types.penalty.AbstractPenalty;

/**
 * Specifically target damage done by entities to entities.
 * 
 * @author asofold
 *
 */
public abstract class FightPenaltyEntityDamageByEntity extends AbstractPenalty<EntityDamageByEntityEvent> {

    /*
     * TODO: Implement PvP penalties too (!) - use a special argument created
     * within fight listener (Player attacker, Player damaged, further).
     */

    public FightPenaltyEntityDamageByEntity() {
        super(EntityDamageByEntityEvent.class);
    }

}
