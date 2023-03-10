package Notebook.controllers;

import Notebook.model.Notes;
import Notebook.model.Record;

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

    public void editNote(String noteId, Record noteUpdated) throws Exception {
        noteUpdated.setId(noteId);
        validateId(noteUpdated);
        notes.editNote(noteUpdated);
    }

    public void deleteNote(String deleteNoteId) {
        notes.deleteNote(deleteNoteId);
    }





    public void saveNote(Record record) /*throws Exception*/ {
//        validateUser(user);
        notes.createNote(record);
//        repository.createUser(user);
    }

    private void validateId (Record record) throws Exception {
        if (record.getId().isBlank()){
            throw new Exception("ID cannot be empty");
        }
    }
    public void checkIfIdExists(String inputId) throws Exception {
        List<Record> allNotes = notes.showAllNotes();
        for (Record note: allNotes) {
            if (note.getId().equals(inputId)) {
                return;
            }
        }
        throw new Exception("No such ID exists. ");
    }

}

