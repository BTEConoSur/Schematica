package com.bteconosur.common.storage.json;

import com.bteconosur.common.Identifiable;
import com.bteconosur.common.storage.ObjectStorage;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.InstanceCreator;

import java.util.Collection;

public class JsonObjectStorage<T extends Identifiable> implements ObjectStorage<T> {

    private final Gson gson;

    public JsonObjectStorage(Class<T> clazz, InstanceCreator<T> instanceCreator) {
        GsonBuilder gsonBuilder = new GsonBuilder();

        gsonBuilder.registerTypeAdapter(clazz, instanceCreator);
        gson = gsonBuilder.create();
    }

    public JsonObjectStorage() {
        gson = new Gson();
    }

    @Override
    public void save(T object) {
        gson.toJson(object);
    }

    @Override
    public T get(String id) {



        return null;
    }

    @Override
    public Collection<T> getAllObjects() {
        return null;
    }

    public static <T extends Identifiable> JsonObjectStorage<T> normalImplementation() {
        return new JsonObjectStorage<>();
    }

    public static <T extends Identifiable> JsonObjectStorage<T> withAdapterSpecial(Class<T> clazz,
                                                                                   InstanceCreator<T> instanceCreator) {
        return new JsonObjectStorage<>(clazz, instanceCreator);
    }

}
