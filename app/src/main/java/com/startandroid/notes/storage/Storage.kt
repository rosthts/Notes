package com.startandroid.notes.storage


import com.startandroid.notes.model.Note


interface Storage {


	fun getNotes() : List<Note>

	fun addNote (note: Note)

}