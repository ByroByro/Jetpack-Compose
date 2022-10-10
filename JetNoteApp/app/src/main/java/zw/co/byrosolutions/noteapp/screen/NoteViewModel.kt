package zw.co.byrosolutions.noteapp.screen

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import zw.co.byrosolutions.noteapp.data.NotesDataSource
import zw.co.byrosolutions.noteapp.model.Note

class NoteViewModel : ViewModel() {

    // notes list
    private var noteList = mutableStateListOf<Note>()

    init {
        noteList.addAll(NotesDataSource().loadNotes())
    }

    fun addNote(note: Note) {
        noteList.add(0,note)
    }

    fun removeNote(note: Note) {
        noteList.remove(note)
    }

    fun getAllNotes(): List<Note> {
        return noteList
    }
}