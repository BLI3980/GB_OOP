package Notebook.model;

import java.util.List;

public interface Notes {
    List<Record> showAllNotes();
    String createNote(Record record);
    void editNote(Record record);
    void deleteNote(String userId);
}
