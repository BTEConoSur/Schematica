package com.bteconosur.common;

import com.bteconosur.common.model.SchematicRegistry;
import com.bteconosur.common.observer.GenericPublisherObserver;

import java.util.Set;

public interface SchematicService {

    void accept(String id, String message, String author);

    void reject(String id, String message, String author);

    GenericPublisherObserver<SchematicRequest> getObserverPublisher();

    Set<SchematicRegistry> getSchematicsRegistered();

}
