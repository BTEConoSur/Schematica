package com.bteconosur.common.write;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

public class WrapperFileHandlerWriter {

    private final File file;

    public WrapperFileHandlerWriter(File file) {
        this.file = file;
    }

    public CompletableFuture<Void> write(String line) throws IOException {



    }

}
