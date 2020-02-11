package com.android.myapplication.movies.persistence.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.android.myapplication.popularmovies.api.model.Cast

@Dao
interface CastDao{
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertListCasts(castList: List<Cast?>?)
}