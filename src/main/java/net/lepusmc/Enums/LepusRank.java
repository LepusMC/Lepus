package net.lepusmc.Enums;

import net.md_5.bungee.api.ChatColor;

public enum LepusRank {

    PLAYER("Player", "a player", "players", "A player", "Players", null),
    MOD("Mod", "a mod", "mods", "A mod", "Mods", ChatColor.RED + "" + ChatColor.BOLD + "M"),
    ADMIN("Admin", "an admin", "admins", "An admin", "Admins", ChatColor.RED + "" + ChatColor.BOLD + "A");

    final private String name;
    final private String lowercaseNameSingular;
    final private String lowercaseNamePlural;
    final private String nameSingular;
    final private String namePlural;
    final private String displayName;

    LepusRank(String name, String lowercaseNameSingular, String lowercaseNamePlural, String nameSingular, String namePlural, String displayName) {
        this.name = name;
        this.lowercaseNameSingular = lowercaseNameSingular;
        this.lowercaseNamePlural = lowercaseNamePlural;
        this.nameSingular = nameSingular;
        this.namePlural = namePlural;
        this.displayName = displayName;
    }

    public String getName() {
        return name;
    }

    public String getLowercaseNameSingular() {
        return lowercaseNameSingular;
    }

    public String getLowercaseNamePlural() {
        return lowercaseNamePlural;
    }

    public String getNameSingular() {
        return nameSingular;
    }

    public String getNamePlural() {
        return namePlural;
    }

    public String getDisplayName() {
        return displayName;
    }
}
