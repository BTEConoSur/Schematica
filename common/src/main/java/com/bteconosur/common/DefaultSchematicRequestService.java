package com.bteconosur.common;

import com.bteconosur.common.observer.GenericPublisherObserver;
import com.bteconosur.common.util.IdentifierCreatorUtil;
import sun.net.www.content.text.Generic;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class DefaultSchematicRequestService implements SchematicRequestService {

    private static final int ID_SIZE = 6;

    private final Map<String, SchematicRequest> requests;
    private final GenericPublisherObserver<SchematicRequest> schematicRequestGenericPublisherObserver =
            new GenericPublisherObserver<>();

    public DefaultSchematicRequestService() {
        requests = new HashMap<>();
    }

    @Override
    public boolean uploadRequest(String userId, String userName, File schematicFile) {

        String idRequest = IdentifierCreatorUtil.generateId(ID_SIZE);

        SchematicRequest newRequest = new SchematicRequest(
                idRequest,
                userId,
                userName,
                schematicFile
        );

        requests.put(idRequest, newRequest);

        return true;
    }

    @Override
    public SchematicRequest get(String id) {
        return requests.get(id);
    }

}
