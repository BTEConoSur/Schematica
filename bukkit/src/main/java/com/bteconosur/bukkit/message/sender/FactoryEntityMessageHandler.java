package com.bteconosur.bukkit.message.sender;

public interface FactoryEntityMessageHandler {

    <S> EntityMessageSender<S> getEntityMessage(Class<S> clazz);

    <S> void newEntityMessageHandler(Class<S> clazz, EntityMessageSender<S> entityMessageSender);

}
