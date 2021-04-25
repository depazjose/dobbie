package com.mdt.dobbie.domain.model

data class HomeLocation(
    var locationId: Long?,
    val homeId: Long,
    val description: String) {
}