package com.luzinsk.scratchmarks;


import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class ScratchMarks extends JavaPlugin implements Listener {

    public void onEnable() {
        getServer().getPluginManager().registerEvents(new ScratchListener(), this);
        getLogger().info("ScratchMarks Started");
    }

    public void onDisable() {
        getLogger().info("ScratchMarks Closed");
    }

}
