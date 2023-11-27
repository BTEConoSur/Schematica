package com.bteconosur.common.model;

import com.bteconosur.common.Identifiable;

public class SchematicRegistry implements Identifiable {

    private final String name;
    private final String id;
    private final String author;
    private final String path;

    public SchematicRegistry(String name, String id, String author,
                             String path) {
        this.name = name;
        this.id = id;
        this.author = author;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPath() {
        return path;
    }

    @Override
    public String id() {
        return id;
    }

}
