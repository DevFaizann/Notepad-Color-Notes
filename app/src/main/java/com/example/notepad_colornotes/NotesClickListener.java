package com.example.notepad_colornotes;

import androidx.cardview.widget.CardView;

import com.example.notepad_colornotes.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
