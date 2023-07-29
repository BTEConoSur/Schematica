package com.bteconosur.bukkit.message.placeholder;

import java.util.Stack;

public class PlaceholderObjects {

    private final Stack<ObjectPair> objectPairs;

    public PlaceholderObjects() {
        this.objectPairs = new Stack<>();
    }

    public PlaceholderObjects(Stack<ObjectPair> objectPairs) {
        this.objectPairs = objectPairs;
    }

    public void push(ObjectPair objectPair) {
        objectPairs.add(objectPair);
    }

    public ObjectPair getOther() {
        return objectPairs.pop();
    }

    public static class PlaceholderObjectsBuilder {

        private Stack<ObjectPair> objectPairs;

        public PlaceholderObjectsBuilder newPlaceholder(ObjectPair objectPair) {
            objectPairs.add(objectPair);
            return self();
        }

        public PlaceholderObjectsBuilder self() {
            return this;
        }

        public PlaceholderObjects build() {
            return new PlaceholderObjects(objectPairs);
        }

    }

}
