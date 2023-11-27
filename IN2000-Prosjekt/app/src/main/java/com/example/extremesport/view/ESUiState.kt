package com.example.extremesport.view

import com.example.extremesport.model.*

data class ESUiState(
    val sunrise: SunriseData? = null,
    val nowcast: NowcastData? = null,
    val locationForecast: LocationForecastData? = null,
    val openAdress: OpenAddressData? = null
)