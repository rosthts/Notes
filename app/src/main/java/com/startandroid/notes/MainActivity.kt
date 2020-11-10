package com.startandroid.notes

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.startandroid.notes.model.Note
import com.startandroid.notes.storage.storage
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.note_view.view.*


class MainActivity : Activity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		open_new_note_view_button.setOnClickListener() {
			intent = Intent(this, NewNoteActivity::class.java)
			startActivityForResult(intent, 1)
		}
	}

	override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
			addNewNoteTextView(storage.getNotes().get(storage.getNotes().size - 1))

	}

	private fun addNewNoteTextView(note: Note) {
		val view: View = layoutInflater.inflate(R.layout.note_view, notes_list, false)
		val label : TextView = view.label_view
		val body : TextView = view.body_view
		label.text = note.title
		body.text = note.body
		notes_list.addView(view)

	}
}

