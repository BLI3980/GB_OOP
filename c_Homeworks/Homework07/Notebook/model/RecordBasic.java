package Notebook.model;

import java.time.LocalDateTime;

public class RecordBasic extends Record{
    public RecordBasic(String id, String header, String body) {
        super(id, header, body);
    }

    public RecordBasic(String header, String body) {
        super(header, body);
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public void setId(String id) {
        super.setId(id);
    }

    @Override
    public String getHeader() {
        return super.getHeader();
    }

    @Override
    public void setHeader(String header) {
        super.setHeader(header);
    }

    @Override
    public String getBody() {
        return super.getBody();
    }

    @Override
    public void setBody(String body) {
        super.setBody(body);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
