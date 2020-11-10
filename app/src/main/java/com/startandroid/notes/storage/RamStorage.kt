package com.startandroid.notes.storage


import com.startandroid.notes.model.Note


object RamStorage : Storage {

	private val notes = ArrayList<Note>();

	override fun getNotes() = notes

	override fun addNote (note: Note) {
		notes.add(note)
	}

}