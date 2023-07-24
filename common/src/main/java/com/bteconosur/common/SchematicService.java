package com.bteconosur.common;

public interface SchematicService {

    void accept(String id, String message, String author);

    void reject(String id, String message, String author);

}
