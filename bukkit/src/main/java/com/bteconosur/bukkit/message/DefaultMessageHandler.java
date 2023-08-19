package com.bteconosur.bukkit.message;

import com.bteconosur.bukkit.message.placeholder.PlaceholderObjects;
import com.bteconosur.bukkit.message.sender.EntityMessageSender;
import com.bteconosur.bukkit.message.sender.EntityMessageSenderFactory;

public class DefaultMessageHandler<S> implements MessageHandler<S> {

    private final EntityMessageSender<S> entityMessageSender;

    public DefaultMessageHandler(Class<S> sClass,
                                 EntityMessageSenderFactory factory) {
        entityMessageSender = factory.getEntityMessageSender(sClass);
    }

    @Override
    public String getMessage(String path) {
        return null;
    }

    @Override
    public String getMessage(String path, PlaceholderObjects placeholder) {
        return null;
    }

    @Override
    public void send(S sender, String path) {
        String message = getMessage(path);



        String newMessageBadWay = new String("Hello :D");

        String newMessageBestWay = "Hello X2 :D";


        entityMessageSender.send(sender, message);
    }

    @Override
    public void send(S sender, String path, PlaceholderObjects placeholder) {
        String message = getMessage(path, placeholder);

        entityMessageSender.send(sender, message);
    }

}
