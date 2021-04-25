package com.mdt.dobbie.infrastructure.adapters.database.sqlite

import android.content.ContentValues
import android.provider.BaseColumns
import com.mdt.dobbie.domain.model.Home

class HomeData {

  class HomeEntry: BaseColumns {
    companion object {
        const val TABLE_NAME = "home"
        const val USER_ID = "user_id"
        const val HOME_ID = "home_id"
        const val DESCRIPTION = "description"
    }
  }

  fun toContentValuesFromModel(homeModel: Home): ContentValues {
    val values = ContentValues().apply {
        put(HomeEntry.USER_ID, homeModel.userId)
        put(HomeEntry.DESCRIPTION, homeModel.description)
    }
    return values;
  }

}