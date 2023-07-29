package com.bteconosur.bukkit.message.sender;

import org.bukkit.entity.Player;

public class PlayerEntityMessageSender implements EntityMessageSender<Player> {

    @Override
    public void send(Player sender, String message) {
        sender.sendMessage(message);
    }

}
