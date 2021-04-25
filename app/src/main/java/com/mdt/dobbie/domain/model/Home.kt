package com.mdt.dobbie.domain.model

data class Home(
    var homeId: Long?,
    val userId: String,
    val description: String)  {
}