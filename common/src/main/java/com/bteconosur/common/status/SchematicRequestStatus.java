package com.bteconosur.common.status;

public class SchematicRequestStatus {

    private final SchematicRequestStatusType type;
    private final String message;
    private final String author;

    public SchematicRequestStatus(SchematicRequestStatusType type,
                                  String message,
                                  String author) {
        this.type = type;
        this.message = message;
        this.author = author;
    }

    public SchematicRequestStatusType getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }

    public String getAuthor() {
        return author;
    }

    public enum SchematicRequestStatusType {
        ACCEPTED, REJECTED;
    }

    public static SchematicRequestStatusBuilder newBuilder() {
        return new SchematicRequestStatusBuilder();
    }

    public static class SchematicRequestStatusBuilder {

        private SchematicRequestStatusType type;
        private String message;
        private String author;

        public SchematicRequestStatusBuilder type(SchematicRequestStatusType type) {
            this.type = type;
            return self();
        }

        public SchematicRequestStatusBuilder message(String message) {
            this.message = message;
            return self();
        }

        public SchematicRequestStatusBuilder author(String author) {
            this.author = author;
            return self();
        }

        public SchematicRequestStatusBuilder self() {
            return this;
        }

        public SchematicRequestStatus build() {
            return new SchematicRequestStatus(type, message, author);
        }

    }

}
