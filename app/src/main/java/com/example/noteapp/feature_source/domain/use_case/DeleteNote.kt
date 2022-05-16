package com.example.noteapp.feature_source.domain.use_case

import com.example.noteapp.feature_source.domain.model.Note
import com.example.noteapp.feature_source.domain.repository.NoteRepository

class DeleteNote(private val repository: NoteRepository) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}