package com.bteconosur.common.storage.configuration;

import com.bteconosur.common.read.QueueStreamReader;
import com.bteconosur.common.util.Pair;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationResolver {

    private static final String CHARACTER_SEPARATION = ":";

    public Map<String, String> configuration;

    public ConfigurationResolver(Map<String, String> configuration) {
        this.configuration = configuration;
    }

    public String getPath(String key) {
        return configuration.get(key);
    }

    public static ConfigurationResolver buildWithFile(String fileName) {
        Map<String, String> configuration = new HashMap<>();
        fillConfiguration(fileName, configuration);

        return new ConfigurationResolver(configuration);
    }

    private static void fillConfiguration(String fileName, Map<String, String> configuration) {
        QueueStreamReader<String> queueStreamReader = QueueStreamReader.
                file(fileName);

        while (queueStreamReader.hasNext()) {
            Pair<String, String> pair = processLine(queueStreamReader.next());

            configuration.put(pair.getKey(), pair.getValue());
        }

    }

    private static Pair<String, String> processLine(String line) {

        String[] separation =
                line.split(CHARACTER_SEPARATION);

        String title = separation[0];
        String content = separation[1];

        return new Pair<>(title, content);
    }

}
