package com.enderdevelopment.plugin;

import org.bukkit.block.Hopper;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryMoveItemEvent;

public final class HopperListener implements Listener {
    @EventHandler
    public void onInventoryMoveItem(InventoryMoveItemEvent event) {
        if (event.getInitiator().getHolder(false) instanceof Hopper hopper) {
            hopper.setTransferCooldown(0);
        }
    }
}
