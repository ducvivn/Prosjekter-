package com.example.extremesport.model

data class RequirementsResult(
    var today: LocationForecastData.Dataholder?,
    var oneday: LocationForecastData.Dataholder?,
    var twodays: LocationForecastData.Dataholder?,
    var threedays: LocationForecastData.Dataholder?,
    var openAddressName: String?
)