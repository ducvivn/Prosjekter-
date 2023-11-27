package com.example.extremesport.model

data class SunriseData(
    val copyright: String,
    val licenseURL: String,
    val type: String,
    val geometry: Geometry,
    val `when`: When,
    val properties: Properties
    ) {
    data class Geometry(
        val type: String,
        val coordinates: List<Double>
    )

    data class When(
        val interval: List<String>
    )

    data class Properties(
        val body: String,
        val sunrise : Sunrise,
        val sunset: Sunset,
        val solarnoon: SolarNoon,
        val solarmidnight: SolarMidnight
    )

    data class Sunrise(
        val time: String,
        val azimuth: Double
    )

    data class Sunset(
        val time: String,
        val azimuth: Double
    )

    data class SolarNoon(
        val time: String,
        val disc_centre_elevation: Double,
        val visible: Boolean
    )

    data class SolarMidnight(
        val time: String,
        val disc_centre_elevation: Double,
        val visible: Boolean
    )
}
