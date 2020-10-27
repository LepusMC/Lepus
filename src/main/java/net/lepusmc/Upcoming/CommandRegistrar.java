package net.lepusmc.Upcoming;

import net.lepusmc.Main.Lepus;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandMap;
import org.bukkit.command.PluginCommand;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.SimplePluginManager;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Arrays;

public class CommandRegistrar {

    /*
    private LepusCommand[] registeredCommands = null;

    private static Constructor<PluginCommand> commandConstructor;
    private static CommandMap commandMap;

    static {
        try {
            commandConstructor = PluginCommand.class.getDeclaredConstructor(String.class, Plugin.class);
            commandConstructor.setAccessible(true);

            Field f = SimplePluginManager.class.getDeclaredField("commandMap");
            f.setAccessible(true);
            commandMap = (CommandMap) f.get(Bukkit.getPluginManager());
        } catch (Exception e) {
            e.printStackTrace();

            commandConstructor = null;
            commandMap = null;
        }
    }

    public void register() {
        if (commandConstructor == null) return; // Uh-oh..

        if (registeredCommands != null) unregister();
        registeredCommands = getCommands();

        Plugin lepus = Lepus.getPlugin();

        for (LepusCommand lepusCommand : registeredCommands) {
            String[] aliases = lepusCommand.getAliases();

            try {
                PluginCommand pluginCommand = commandConstructor.newInstance(aliases[0], lepus);
                pluginCommand.setAliases(Arrays.asList(aliases));
                commandMap.register(lepus.getDescription().getName(), pluginCommand);
                //commandMap.getKnownCommands().remove(command);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void unregister() {
        if (registeredCommands == null) return;

        for (LepusCommand lepusCommand : registeredCommands) {
            commandMap.
        }

        registeredCommands = null;
    }
    */
}
