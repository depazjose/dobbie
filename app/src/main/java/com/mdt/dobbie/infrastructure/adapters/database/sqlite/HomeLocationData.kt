package com.mdt.dobbie.infrastructure.adapters.database.sqlite

import android.provider.BaseColumns

object HomeLocationData {

    object HomeLocationEntry : BaseColumns {
        const val TABLE_NAME = "home_location"
        const val DESCRIPTION = "description"
        const val LOCATION_ID = "location_id"
        const val HOME_ID = "home_id"
    }
}