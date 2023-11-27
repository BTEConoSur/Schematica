package com.bteconosur.common.file;

import java.io.File;
import java.util.concurrent.Future;

public interface SchematicFileService {

    String root();

    Future<Void> uploadFile(File file);

    File provideSchematic(String fileName);

}
