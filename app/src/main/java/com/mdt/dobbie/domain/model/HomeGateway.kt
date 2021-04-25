package com.mdt.dobbie.domain.model

interface HomeGateway {

  fun newHome(home: Home): Home

  fun newHomeLocation(homeLocation: HomeLocation): HomeLocation
}