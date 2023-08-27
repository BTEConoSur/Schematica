package com.bteconosur.common.read;

import java.util.Queue;
import java.util.Stack;

public abstract class QueueStreamReader<T> {

    protected Queue<T> queue;

    public T next() {
        return queue.poll();
    }

    public boolean hasNext() {
        return queue.isEmpty();
    }

    public static QueueStreamReader<String> file(String file) {
        return new StringQueueStreamReader(file);
    }

}
