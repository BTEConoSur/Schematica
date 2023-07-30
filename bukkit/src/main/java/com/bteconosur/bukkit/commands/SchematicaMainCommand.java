package com.bteconosur.bukkit.commands;

import com.bteconosur.bukkit.MainPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class SchematicaMainCommand implements CommandExecutor {

    private final MainPlugin mainPlugin;

    public SchematicaMainCommand(MainPlugin mainPlugin) {
        this.mainPlugin = mainPlugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return false;
    }

}
