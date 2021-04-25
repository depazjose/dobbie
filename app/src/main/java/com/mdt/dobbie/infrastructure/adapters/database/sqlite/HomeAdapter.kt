package com.mdt.dobbie.infrastructure.adapters.database.sqlite

import android.content.Context
import android.util.Log
import android.util.Log.INFO
import com.mdt.dobbie.domain.model.Home
import com.mdt.dobbie.domain.model.HomeGateway
import com.mdt.dobbie.domain.model.HomeLocation

class HomeAdapter(context: Context): HomeGateway {
   private val repository = DatabaseRepository(context)
   private val db = repository.writableDatabase

   override fun newHome(home: Home): Home  {

     val id = db?.insert(HomeData.HomeEntry.TABLE_NAME,
         null,
         HomeData().toContentValuesFromModel(home))
     id.let { home.homeId = id }
     Log.i("INFO", "new home: " + home.toString())

     return home
   }

  override fun newHomeLocation(homeLocation: HomeLocation): HomeLocation {
    val id = db?.insert(
      HomeLocationData.HomeLocationEntry.TABLE_NAME,
      null,
      HomeLocationData.toContentValuesFromModel(homeLocation)
    )

    id.let { homeLocation.locationId = id }
    Log.i("INFO", "new home localtion: " + homeLocation.toString())
    return homeLocation
  }

}