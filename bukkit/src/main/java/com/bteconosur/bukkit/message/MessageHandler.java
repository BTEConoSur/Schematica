package com.bteconosur.bukkit.message;

import com.bteconosur.bukkit.message.placeholder.PlaceholderObjects;

public interface MessageHandler<S> {

    String getMessage(String path);

    String getMessage(String path, PlaceholderObjects placeholder);

    void send(S sender, String path);

    void send(S sender, String path, PlaceholderObjects placeholder);



}
