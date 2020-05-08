package com.luzinsk.scratchmarks;

import org.bukkit.Particle;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class ScratchListener implements Listener {

    @EventHandler(priority = EventPriority.NORMAL)
    public void onPlayerSprint(PlayerMoveEvent event) {

        if (event.getPlayer().isSprinting()) {
            event.getPlayer().spawnParticle(Particle.LANDING_LAVA, event.getPlayer().getLocation(), 2, .8, .2,.8, 1);
        }
    }

}

