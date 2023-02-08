package Notebook.model;

public interface Repo {
    String createRecord (Record record);
    void editRecord(Record record);
    void deleteRecord(Record record);
}
