package com.bteconosur.bukkit.message.placeholder;

public class ObjectPair {

    private final String identifier;
    private final Object object;

    public ObjectPair(String identifier,
                      Object object) {
        this.identifier = identifier;
        this.object = object;
    }

    public String getIdentifier() {
        return identifier;
    }

    public Object getObject() {
        return object;
    }

}
