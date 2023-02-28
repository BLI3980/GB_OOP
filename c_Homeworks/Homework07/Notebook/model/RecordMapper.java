package Notebook.model;

public class RecordMapper {
    public String map(Record record) {
        return String.format("%s;%s;%s", record.getId(), record.getHeader(), record.getBody());
    }

    public Record map(String line) {
        String[] lines = line.split(";");
        return new RecordBasic(lines[0], lines[1], lines[2]);
    }
}
