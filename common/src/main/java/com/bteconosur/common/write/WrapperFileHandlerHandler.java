package com.bteconosur.common.write;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class WrapperFileHandlerHandler {

    private final File file;
    private final WrapperFileHandlerReader reader;

    public WrapperFileHandlerHandler(File file) throws FileNotFoundException {
        this.file = file;

        reader = new WrapperFileHandlerReader(file);
    }

    public File getFile() {
        return file;
    }

    public List<String> readLines() throws ExecutionException, InterruptedException {
        return reader.readAll();
    }

    public String readLine() throws ExecutionException, InterruptedException {
        CompletableFuture<String> completableFuture = reader.read();

        return completableFuture.get();
    }

    public Future<Void> write(String line) {

    }

}
