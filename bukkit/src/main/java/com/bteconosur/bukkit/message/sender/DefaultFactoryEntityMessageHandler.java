package com.bteconosur.bukkit.message.sender;

import java.util.HashMap;
import java.util.Map;

public class DefaultFactoryEntityMessageHandler implements FactoryEntityMessageHandler {

    private final Map<Class<?>, EntityMessageSender<?>> entityMessageSenderCompound;

    public DefaultFactoryEntityMessageHandler() {
        entityMessageSenderCompound = new HashMap<>();
    }

    @Override
    public <S> EntityMessageSender<S> getEntityMessage(Class<S> clazz) {
        return (EntityMessageSender<S>) entityMessageSenderCompound.get(clazz);
    }

    @Override
    public <S> void newEntityMessageHandler(Class<S> clazz, EntityMessageSender<S> entityMessageSender) {
        entityMessageSenderCompound.put(clazz, entityMessageSender);
    }

}
