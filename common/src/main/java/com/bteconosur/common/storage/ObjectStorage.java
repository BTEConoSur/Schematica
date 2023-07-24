package com.bteconosur.common.storage;

import com.bteconosur.common.Identifiable;

import java.util.Collection;

public interface ObjectStorage<T extends Identifiable> {

    void save(T object);

    T get(String id);

    default boolean exists(String id) {
        return get(id) != null;
    }

    Collection<T> getAllObjects();

}
