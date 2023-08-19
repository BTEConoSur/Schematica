package com.bteconosur.common.storage;

import java.util.HashMap;
import java.util.Map;

public class Credentials {

    private final Map<String, String> credentials;

    public Credentials() {
        credentials = new HashMap<>();
    }

    public Credentials(Map<String, String> credentials) {
        this.credentials = credentials;
    }

    public String getAsString(String key) {
        return credentials.get(key);
    }

    public int getAsInt(String key) {
        return Integer.parseInt(credentials.get(key));
    }

    public static Credentials asMap(Map<String, String> credentials) {
        return new Credentials(credentials);
    }

}
