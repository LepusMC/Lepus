package net.lepusmc.Main;

import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Lepus extends JavaPlugin {

    private static Plugin plugin;

    public static Plugin getPlugin() {
        return plugin;
    }

    //

    public static void registerListeners(Listener... listeners) {
        for (Listener listener : listeners) plugin.getServer().getPluginManager().registerEvents(listener, plugin);
    }

    public static void registerListener(Listener listener) {
        plugin.getServer().getPluginManager().registerEvents(listener, plugin);
    }

    public static void unregisterListeners(Listener... listeners) {
        for (Listener listener : listeners) HandlerList.unregisterAll(listener);
    }

    public static void unregisterListener(Listener listener) {
        HandlerList.unregisterAll(listener);
    }

    //

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

    }
}
