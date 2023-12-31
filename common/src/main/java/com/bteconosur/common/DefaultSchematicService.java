package com.bteconosur.common;

import com.bteconosur.common.model.SchematicRegistry;
import com.bteconosur.common.observer.GenericPublisherObserver;
import com.bteconosur.common.status.SchematicRequestStatus;

import java.util.Set;

public class DefaultSchematicService implements SchematicService {

    private final SchematicRequestService schematicRequestService;
    private final GenericPublisherObserver<SchematicRequest> publisherObserver;

    public DefaultSchematicService(SchematicRequestService schematicRequestService) {
        this.schematicRequestService = schematicRequestService;
        publisherObserver = new GenericPublisherObserver<>();
    }

    @Override
    public void accept(String id, String message, String author) {
        updateStatus(id, message, author, SchematicRequestStatus.SchematicRequestStatusType.ACCEPTED);
    }

    @Override
    public void reject(String id, String message, String author) {
        updateStatus(id, message, author, SchematicRequestStatus.SchematicRequestStatusType.REJECTED);
    }

    @Override
    public GenericPublisherObserver<SchematicRequest> getObserverPublisher() {
        return publisherObserver;
    }

    @Override
    public Set<SchematicRegistry> getSchematicsRegistered() {
        return null;
    }

    private void updateStatus(String id, String message, String author,
                              SchematicRequestStatus.SchematicRequestStatusType type) {
        SchematicRequest request = schematicRequestService.get(id);

        if (request == null) {
            return;
        }

        request.updateStatus(
                SchematicRequestStatus.newBuilder()
                        .type(type)
                        .message(message)
                        .author(author)
                        .build()
        );

        boolean response = publisherObserver.notifyAll(request);

        if (!response) {

        }

    }

}
