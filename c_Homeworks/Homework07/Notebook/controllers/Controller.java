package Notebook.controllers;

import Notebook.model.Notes;
import Notebook.model.Record;
import Notebook.model.Repository;
import Notebook.model.User;

import java.util.List;

public class Controller {
    private final Notes notes;

    public Controller(Notes notes) {
        this.notes = notes;
    }

    public List<Record> readAllNotes() {
        List<Record> result = notes.showAllNotes();
        return result;
    }

    public Record readNote(String noteId) throws Exception {
        List<Record> allNotes = notes.showAllNotes();
        for (Record record : allNotes) {
            if (record.getId().equals(noteId)) {
                return record;
            }
        }

        throw new Exception("Note not found");
    }

    public void saveNote(Record record) /*throws Exception*/ {
//        validateUser(user);
        notes.createNote(record);
//        repository.createUser(user);
    }



}

