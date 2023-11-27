package com.bteconosur.common.file;

import java.io.File;
import java.util.concurrent.Future;

public class DefaultSchematicFileService implements SchematicFileService {

    private static final String EXTENSION = ".schematic";
    private final String root;

    public DefaultSchematicFileService(String root) {
        this.root = root;

        File folder = new File(root);
        createFolderIfNotExists(folder);
    }

    private void createFolderIfNotExists(File folder) {
        if (!folder.exists()) {
            folder.mkdirs();
        }
    }

    @Override
    public String root() {
        return root;
    }

    @Override
    public Future<Void> uploadFile(File file) {
        return null;
    }

    @Override
    public File provideSchematic(String fileName) {
        return new File(root + fileName + EXTENSION);
    }

}
