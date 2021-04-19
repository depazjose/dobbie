package com.mdt.dobbie.infrastructure.adapters.database.sqlite

import android.provider.BaseColumns

class HomeData {

  class HomeEntry: BaseColumns {
    companion object {
        const val TABLE_NAME = "home"
        const val DESCRIPTION = "description"
        const val USER_ID = "user_id"
        const val HOME_ID = "home_id"
    }
  }

}