package com.bteconosur.common.observer.interceptor;

import com.bteconosur.common.SchematicRequest;
import com.bteconosur.common.observer.AbstractGenericObserver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class UploadSchematicInterceptorSizeDelimiter extends AbstractGenericObserver<SchematicRequest> {

    private static final int KILO_BYTE_TO_BYTE = 1024;
    private static final int MAX_SIZE_IN_KILO_BYTE = 20;

    @Override
    public void update(SchematicRequest element) {

        File file = element.getSchematicFile();

        long sizeFileInBytes = getFileSize(file);
        long sizeFileInKiloBytes = sizeFileInBytes / KILO_BYTE_TO_BYTE;

        if (sizeFileInBytes == -1 || sizeFileInKiloBytes > MAX_SIZE_IN_KILO_BYTE) {
            cancel();
        }

    }

    private long getFileSize(File file) {
        try {
            return Files.size(Paths.get(file.getPath()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return -1;
    }

}
