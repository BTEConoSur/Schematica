package com.bteconosur.common;

public interface SchematicService {

    void accept(String id, String message);

    void reject(String id, String message);

}
