package com.example.notepad_colornotes.Database;

import static androidx.room.OnConflictStrategy.REPLACE;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.notepad_colornotes.Models.Notes;

import java.util.List;

@Dao
public interface MainDAO {
    //method to insert data into our database
    @Insert(onConflict = REPLACE)
    void insert(Notes notes);

    //method to get all the data, datatype is list
    @Query("SELECT * FROM notes ORDER BY id DESC") //this query arranges the items in the notes in descending order. newly added ones will be at the top
    List<Notes> getAll();

    //method to update the data
    @Query("UPDATE notes SET title = :title, notes = :notes WHERE ID = :id") //takes the value from the model and that of the update method parameter
    void update(int id, String title, String notes);

    @Delete
    void delete(Notes notes);
}
