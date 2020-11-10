package com.startandroid.notes

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.startandroid.notes.model.Note
import com.startandroid.notes.storage.storage
import kotlinx.android.synthetic.main.activity_new_note.*

class NewNoteActivity : Activity() {

	private val EXTRA_NOTES_LABEL = "NOTES_LABEL"
	private val EXTRA_NOTES_BODY = "NOTES_BODY"


	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_new_note)
		create_note_button.setOnClickListener {

			storage.addNote(
				Note(
					title = edit_label_view.text.toString(),
					body = edit_body_view.text.toString()
				)
			)
			finish()
		}
	}



}