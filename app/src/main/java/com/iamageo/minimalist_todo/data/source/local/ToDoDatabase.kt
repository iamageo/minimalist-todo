package com.iamageo.minimalist_todo.data.source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.iamageo.minimalist_todo.data.Task

@Database(entities = [Task::class], version = 1, exportSchema = false)
abstract class ToDoDatabase : RoomDatabase() {

    abstract fun taskDao(): TasksDao

}