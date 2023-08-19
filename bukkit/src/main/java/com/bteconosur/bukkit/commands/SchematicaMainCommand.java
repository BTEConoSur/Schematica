package com.bteconosur.bukkit.commands;

import com.bteconosur.bukkit.MainPlugin;
import com.bteconosur.bukkit.message.MessageHandler;
import com.bteconosur.bukkit.message.sender.FactoryEntityMessageHandler;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SchematicaMainCommand implements CommandExecutor {

    private final MainPlugin mainPlugin;


    private final MessageHandler<Player> playerMessageHandler;
    private final MessageHandler<CommandSender> commandSenderMessageHandler;


    public SchematicaMainCommand(MainPlugin mainPlugin,
                                 MessageHandler<Player> playerMessageHandler,
                                 MessageHandler<CommandSender> commandSenderMessageHandler) {
        this.mainPlugin = mainPlugin;
        this.playerMessageHandler = playerMessageHandler;
        this.commandSenderMessageHandler = commandSenderMessageHandler;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {
            commandSenderMessageHandler.send(sender, "commands.no-execute-in-console");
            return true;
        }

        return false;
    }

}
