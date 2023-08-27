package com.bteconosur.common.read;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringQueueStreamReader extends QueueStreamReader<String> {

    private final String fileName;

    public StringQueueStreamReader(String fileName) {
        super();

        this.fileName = fileName;

        read();
    }

    private void read() {
        File file = new File(fileName);
        if (!file.exists()) {
            return;
        }

        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNext()) {
                queue.add(scanner.next());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
