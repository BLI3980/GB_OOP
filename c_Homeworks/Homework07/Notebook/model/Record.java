package Notebook.model;

import java.time.LocalDateTime;

public abstract class Record {
    private String id = "";
    private String header;
    private String body;
//    private LocalDateTime dateTime;

    public Record(String header, String body) {
        this.header = header;
        this.body = body;
    }

    public Record(String id, String header, String body) {
        this.id = id;
        this.header = header;
        this.body = body;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return String.format("Note ID: %s;\nHeader: %s;\nNote text: %s;\n", getId(),getHeader(),getBody());
    }
}
