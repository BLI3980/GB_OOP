package Notebook.model;

import java.time.LocalDateTime;

public class RecordBasic extends Record{
    public RecordBasic(int id, String header, String body) {
        super(id, header, body);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
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
