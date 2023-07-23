package com.bteconosur.common;

import java.io.File;

public interface SchematicRequestService {

    boolean uploadRequest(String userId, String userName,
                     File schematicFile);

    SchematicRequest get(String id);

}
