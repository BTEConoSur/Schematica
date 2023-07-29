package com.bteconosur.bukkit.message.sender;

public interface EntityMessageSender<S> {

    void send(S sender, String message);

}
