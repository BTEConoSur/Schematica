package com.bteconosur.common;

import com.bteconosur.common.status.SchematicRequestStatus;

import java.io.File;

public class SchematicRequest implements Identifiable {

    private final String idRequest;
    private final String userId;
    private final String userName;
    private final File schematicFile;
    private SchematicRequestStatus schematicRequestStatus;

    public SchematicRequest(String idRequest, String userId, String userName,
                            File schematicFile) {
        this.idRequest = idRequest;
        this.userId = userId;
        this.userName = userName;
        this.schematicFile = schematicFile;
        schematicRequestStatus = null;
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

    public void updateStatus(SchematicRequestStatus schematicRequestStatus) {
        this.schematicRequestStatus = schematicRequestStatus;
    }

    public boolean isViewForStaff() {
        return schematicRequestStatus != null;
    }

    @Override
    public String getId() {
        return idRequest;
    }
}
