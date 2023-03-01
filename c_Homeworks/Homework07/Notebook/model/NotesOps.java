package Notebook.model;

import java.util.ArrayList;
import java.util.List;

import static Notebook.Config.dbFile;

public class NotesOps implements Notes{
    private RecordMapper mapper = new RecordMapper();
    private DatabaseRead readDb;
    private DatabaseSave saveDb;

    public NotesOps(DatabaseSave saveDb) {
        this.saveDb = saveDb;
    }

    public NotesOps(DatabaseRead readDb) {
        this.readDb = readDb;
    }

    @Override
    public List<Record> showAllNotes() {
        List<String> lines = readDb.readDatabase();
        List<Record> notes = new ArrayList<>();
        for (String line: lines) {
            notes.add(mapper.map(line));
        }
        return notes;
    }

    @Override
    public String createNote(Record record) {
        List<Record> notes = showAllNotes();
        int max = 0;
        for (Record item : notes) {
            int id = Integer.parseInt(item.getId());
            if (max < id){
                max = id;
            }
        }
        int newId = max + 1;
        String id = String.format("%d", newId);
        record.setId(id);
        notes.add(record);
        writeToFile(notes);
        return id;
    }

    @Override
    public void editNote(Record newNote) {
        List<Record> notes = showAllNotes();
        Record target = notes.stream().filter(oldNote ->
                        oldNote.getId().equals(newNote.getId())).
                        findFirst().get();
        target.setHeader(newNote.getHeader());
        target.setBody(newNote.getBody());
        writeToFile(notes);
    }

    @Override
    public void deleteNote(String deleteNoteId) {
        List<Record> notes = showAllNotes();
        List<Record> tempList = new ArrayList<>();
        Record toDelete = notes.stream().filter(i -> i.getId().equals(deleteNoteId)).
                findFirst().get();

        for (Record note: notes) {
            if(note.getId().equals(toDelete.getId())){
                continue;
            }
            tempList.add(note);
        }
        writeToFile(tempList);
    }

    private void writeToFile(List<Record> records){
        List<String> lines = new ArrayList<>();
        saveDb = new DBSaveFile(dbFile);
        for (Record item: records) {
            lines.add(mapper.map(item));
        }
        saveDb.saveDatabase(lines);
//        fileOperation.saveAllLines(lines);
    }
}
