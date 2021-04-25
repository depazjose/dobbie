package com.mdt.dobbie.infrastructure.adapters.database.sqlite

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.provider.BaseColumns
import com.mdt.dobbie.R

class DatabaseRepository(context: Context) : SQLiteOpenHelper(
    context,
    DATABASE_NAME,
    null,
    DATABASE_VERSION) {

    companion object {
        const val DATABASE_VERSION = 1
        const val DATABASE_NAME: String = R.string.DATABASE_NAME.toString()
    }

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(buildHomeDataSql())
        db?.execSQL(buildHomeLocationDataSql())
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }

    private fun buildHomeDataSql(): String {
        return "CREATE TABLE ${HomeData.HomeEntry.TABLE_NAME} (" +
                "${BaseColumns._ID} INTEGER, " +
                "${HomeData.HomeEntry.USER_ID} TEXT, " +
                "${HomeData.HomeEntry.HOME_ID} INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "${HomeData.HomeEntry.DESCRIPTION} TEXT)"
    }

    private fun buildHomeLocationDataSql(): String {
        return "CREATE TABLE ${HomeLocationData.HomeLocationEntry.TABLE_NAME} (" +
                "${BaseColumns._ID} INTEGER, " +
                "${HomeLocationData.HomeLocationEntry.LOCATION_ID} INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "${HomeLocationData.HomeLocationEntry.HOME_ID} INTEGER, " +
                "${HomeLocationData.HomeLocationEntry.DESCRIPTION} TEXT)"
    }
}