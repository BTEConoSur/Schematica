package com.bteconosur.common.model;

import java.util.HashMap;
import java.util.Map;

public class CacheSchematicRegistry {

    private final Map<String, SchematicRegistry> schematics;

    public CacheSchematicRegistry() {
        schematics = new HashMap<>();
    }

    public void push(SchematicRegistry registry) {
        schematics.put(registry.getName(), registry);
    }

    public SchematicRegistry get(String id) {
        return schematics.get(id);
    }

}
