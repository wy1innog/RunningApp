package com.ihblu.runningapp.di

import android.content.Context
import androidx.room.Room
import com.ihblu.runningapp.db.RunningDatabase
import com.ihblu.runningapp.other.Constants.RUNNING_DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * @Description:
 * @Author: wy1in
 * @Date: 2023/6/18
 */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideRunningDatabase(@ApplicationContext app: Context): RunningDatabase {
        return Room.databaseBuilder(app, RunningDatabase::class.java, RUNNING_DATABASE_NAME).build()
    }

    @Singleton
    @Provides
    fun provideRunDao(db: RunningDatabase) = db.getRunDao()
}