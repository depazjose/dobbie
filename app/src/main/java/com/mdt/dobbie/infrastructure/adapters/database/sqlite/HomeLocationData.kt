package com.mdt.dobbie.infrastructure.adapters.database.sqlite

import android.content.ContentValues
import android.provider.BaseColumns
import com.mdt.dobbie.domain.model.HomeLocation

object HomeLocationData {

    object HomeLocationEntry : BaseColumns {
        const val TABLE_NAME = "home_location"
        const val LOCATION_ID = "location_id"
        const val HOME_ID = "home_id"
        const val DESCRIPTION = "description"
    }

    fun toContentValuesFromModel(homeLocation: HomeLocation): ContentValues {
        val values = ContentValues().apply {
            put(HomeLocationEntry.LOCATION_ID, homeLocation.locationId)
            put(HomeLocationEntry.HOME_ID, homeLocation.homeId)
            put(HomeLocationEntry.DESCRIPTION, homeLocation.description)
        }
        return values;
    }
}