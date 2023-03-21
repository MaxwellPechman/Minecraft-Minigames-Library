package de.maxwell.games;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class GamesPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("MinigamesLib enabled.");
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("MinigamesLib disabled.");
    }
}