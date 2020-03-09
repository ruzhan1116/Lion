package com.ruzhan.movie.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.ruzhan.movie.db.converters.MovieConverters
import com.ruzhan.movie.db.dao.MovieDao
import com.ruzhan.movie.db.dao.MovieDetailDao
import com.ruzhan.movie.db.entity.MovieDetailEntity
import com.ruzhan.movie.db.entity.MovieEntity

@TypeConverters(MovieConverters::class)
@Database(entities = [MovieEntity::class, MovieDetailEntity::class], version = 1)
abstract class MovieDatabase : RoomDatabase() {

    companion object {

        private const val DB_NAME = "base_movie.db"
        @Volatile
        private var INSTANCE: MovieDatabase? = null

        fun get(context: Context): MovieDatabase =
                INSTANCE ?: synchronized(this) {
                    INSTANCE ?: buildDatabase(context).also { INSTANCE = it }
                }

        private fun buildDatabase(context: Context) =
                Room.databaseBuilder(context.applicationContext,
                        MovieDatabase::class.java, DB_NAME)
                        .build()
    }

    abstract fun movieDao(): MovieDao

    abstract fun movieDetailDao(): MovieDetailDao

}