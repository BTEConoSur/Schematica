package com.bteconosur.common.write;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class WrapperFileHandlerReader implements Closeable {

    private final BufferedReader bufferedReader;

    public WrapperFileHandlerReader(File file) throws FileNotFoundException {

        FileReader fileReader = new FileReader(file);
        this.bufferedReader = new BufferedReader(fileReader);

        WrapperFileHandlerHandler wrapperFileHandlerReader = new WrapperFileHandlerHandler(file);
    }

    public List<String> readAll() throws ExecutionException, InterruptedException {

        List<String> content = new ArrayList<>();
        String actualLine = null;

        while ((actualLine = read().get()) != null) {
            content.add(actualLine);
        }

        return content;
    }

    public CompletableFuture<String> read() {
        return CompletableFuture.supplyAsync(() -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        });
    }

    @Override
    public void close() throws IOException {
        bufferedReader.close();
    }

}
