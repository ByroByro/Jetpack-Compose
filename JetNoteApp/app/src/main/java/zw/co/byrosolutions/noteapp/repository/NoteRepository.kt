package zw.co.byrosolutions.noteapp.repository

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.conflate
import kotlinx.coroutines.flow.flowOn
import zw.co.byrosolutions.noteapp.data.NoteDatabaseDao
import zw.co.byrosolutions.noteapp.model.Note
import javax.inject.Inject

class NoteRepository @Inject constructor(private val noteDatabaseDao: NoteDatabaseDao) {
    // insert note
    suspend fun addNote(note: Note) = noteDatabaseDao.insert(note)
    // update note
    suspend fun updateNote(note: Note) = noteDatabaseDao.update(note)
    // delete note
    suspend fun deleteNote(note: Note) = noteDatabaseDao.deleteNote(note = note)
    // delete all notes
    suspend fun deleteAll() = noteDatabaseDao.deleteAll()
    // get all notes
    fun getAllNotes(): Flow<List<Note>> =
        noteDatabaseDao.getNotes().flowOn(Dispatchers.IO).conflate()
}