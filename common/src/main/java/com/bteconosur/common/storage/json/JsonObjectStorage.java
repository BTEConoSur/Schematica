package com.bteconosur.common.storage.json;

import com.bteconosur.common.Identifiable;
import com.bteconosur.common.storage.ObjectStorage;

import java.util.Collection;

public class JsonObjectStorage<T extends Identifiable> implements ObjectStorage<T> {

    @Override
    public void save(T object) {

    }

    @Override
    public T get(String id) {
        return null;
    }

    @Override
    public Collection<T> getAllObjects() {
        return null;
    }

}
