package com.bteconosur.common;

import com.bteconosur.common.observer.GenericPublisherObserver;

public interface SchematicService {

    void accept(String id, String message, String author);

    void reject(String id, String message, String author);

    GenericPublisherObserver<SchematicRequest> getObserverPublisher();

}
