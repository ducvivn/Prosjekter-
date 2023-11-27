package com.example.extremesport.model


data class NowcastData (
    val type: String,
    val geometry: NowcastGeometry,
    val properties: NowcastProperties
) {

    data class NowcastGeometry(
        val type: String,
        val coordinates: List<Double>
    )

    data class NowcastProperties(
        val meta: Meta,
        val timeseries: List<TimeData>
    )

    data class Meta(
        val updated_at: String,
        val units: NowcastUnit,
        val radar_coverage: String
    )

    data class NowcastUnit(
        val air_temperature: String,
        val precipitation_amount: String,
        val precipitation_rate: String,
        val relative_humidity: String,
        val wind_from_direction: String,
        val wind_speed: String,
        val wind_speed_of_gust: String
    )

    data class TimeData(
        val time: String,
        val data: Data
    )

    data class Data(
        val instant: InstantData,
        val next_1_hours: Next1HourData
    )

    data class InstantData(val details: InstantDataDetails)

    data class InstantDataDetails(
        val air_temperature: Double,
        val relative_humidity: Double,
        val wind_from_direction: Double,
        val wind_speed: Double,
        val wind_speed_of_gust: Double
    )

    data class Next1HourData(
        val summary: Summary,
        val details: Next1HourDataDetails
    )

    data class Summary(val symbol_code: String)

    data class Next1HourDataDetails(val precipitation_amount: Double)

}