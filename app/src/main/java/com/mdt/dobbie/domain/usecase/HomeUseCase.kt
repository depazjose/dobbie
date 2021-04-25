package com.mdt.dobbie.domain.usecase

import android.content.Context
import com.mdt.dobbie.domain.model.Home
import com.mdt.dobbie.domain.model.HomeLocation
import com.mdt.dobbie.infrastructure.adapters.database.sqlite.HomeAdapter

class HomeUseCase(context: Context) {

  private val homeGateway = HomeAdapter(context)

  fun newHome(home: Home): Home {
    return homeGateway.newHome(home)
  }

  fun newHomelocation(homeLocation: HomeLocation) {
    homeGateway.newHomeLocation(homeLocation)
  }
}