package com.enderdevelopment.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new HopperListener(), this);
        getLogger().info("FastHopper enabled.");
    }

    @Override
    public void onDisable() {
        getLogger().info("FastHopper disabled.");
    }
}
