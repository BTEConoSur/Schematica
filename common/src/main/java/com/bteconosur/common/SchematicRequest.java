package com.bteconosur.common;

import java.io.File;

public class SchematicRequest {

    private final String idRequest;
    private final String userId;
    private final String userName;
    private final File schematicFile;

    public SchematicRequest(String idRequest, String userId, String userName,
                            File schematicFile) {
        this.idRequest = idRequest;
        this.userId = userId;
        this.userName = userName;
        this.schematicFile = schematicFile;
    }

    public String getIdRequest() {
        return idRequest;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public File getSchematicFile() {
        return schematicFile;
    }

}
