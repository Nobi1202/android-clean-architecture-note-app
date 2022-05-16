package com.example.noteapp.feature_source.domain.use_case

import com.example.noteapp.feature_source.domain.model.Note
import com.example.noteapp.feature_source.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}