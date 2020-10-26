package net.lepusmc.Objects;

import org.bukkit.command.CommandSender;

public interface LepusCommand {
    boolean play(CommandSender sender);

    String[] getAliases();
    String getDescription();

    LepusRank getRequiredRank();
    boolean canUse(CommandSender sender);
}
