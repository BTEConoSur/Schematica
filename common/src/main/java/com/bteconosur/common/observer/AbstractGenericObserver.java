package com.bteconosur.common.observer;

public abstract class AbstractGenericObserver<T> implements GenericObserver<T> {

    private boolean isCancelled = false;

    public void cancel() {
        isCancelled = true;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

}
