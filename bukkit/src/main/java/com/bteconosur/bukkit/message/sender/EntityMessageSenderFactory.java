package com.bteconosur.bukkit.message.sender;

import com.bteconosur.bukkit.message.sender.EntityMessageSender;

import java.util.HashMap;
import java.util.Map;

public class EntityMessageSenderFactory {

    private final Map<Class<?>, EntityMessageSender<?>> entitiesRegistered;

    public EntityMessageSenderFactory() {
        entitiesRegistered = new HashMap<>();
    }


    public <S> EntityMessageSender<S> getEntityMessageSender(Class<S> sClass) {

        EntityMessageSender<S> entityMessageSender =
                (EntityMessageSender<S>) entitiesRegistered.get(sClass);

        if (entityMessageSender == null) {
            throw new NullPointerException("The entity is null");
        }

        return entityMessageSender;
    }

}
