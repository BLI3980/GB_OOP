package Notebook.model;

import java.time.LocalDateTime;

public abstract class Record {
    private int id;
    private String header;
    private String body;
//    private LocalDateTime dateTime;

    public Record(int id, String header, String body) {
        this.id = id;
        this.header = header;
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
        return String.format("Note ID: %d\nHeader: %s\nNote text: %s\n", getId(),getHeader(),getBody());
    }
}
