package zw.co.byrosolutions.noteapp.data

import zw.co.byrosolutions.noteapp.components.dateNow
import zw.co.byrosolutions.noteapp.model.Note

class NotesDataSource {
    fun loadNotes(): List<Note> {
        return listOf(
            Note(
                title = "A good string",
                description = "We went to big Sabbath at St Mary's",
                entryDate = dateNow()
            ),
            Note(
                title = "A good string",
                description = "We went to big Sabbath at St Mary's",
                entryDate = dateNow()
            ),
            Note(
                title = "A good string",
                description = "We went to big Sabbath at St Mary's",
                entryDate = dateNow()
            ),
            Note(
                title = "A good string",
                description = "We went to big Sabbath at St Mary's",
                entryDate = dateNow()
            ),
            Note(
                title = "A good string",
                description = "We went to big Sabbath at St Mary's",
                entryDate = dateNow()
            )
        )
    }
}