package com.bteconosur.common.observer;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenericPublisherObserver<T> {

    private final Set<AbstractGenericObserver<T>> observers;

    public GenericPublisherObserver() {
        observers = new HashSet<>();
    }

    public void addObserver(AbstractGenericObserver<T> observer) {
        observers.add(observer);
    }

    public boolean notifyAll(T t) {
        boolean response = true;

        for (AbstractGenericObserver<T> observer : observers) {
            observer.update(t);

            if (observer.isCancelled()) {
                response = false;
            }
        }

        return response;
    }

}
