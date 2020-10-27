package net.lepusmc.Upcoming;

import net.lepusmc.Enums.LepusRank;
import org.bukkit.command.CommandSender;

public interface LepusCommand {
    boolean play(CommandSender sender);

    String[] getAliases();
    String getDescription();

    LepusRank getRequiredRank();
    boolean canUse(CommandSender sender);
}
