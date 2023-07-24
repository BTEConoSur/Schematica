package com.bteconosur.common.observer;

import com.bteconosur.common.SchematicRequest;

public interface GenericObserver<T> {

    void update(T element);

}
