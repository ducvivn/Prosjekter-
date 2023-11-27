package com.example.extremesport.model

data class LocationForecastData(
    val geometry: Geometry,
    val properties: Properties,
    val type: String
) {
    data class Geometry(
        val coordinates: List<Double>,
        val type: String
    )

    data class Properties(
        val meta: Meta,
        val timeseries: List<Dataholder>
    )

    data class Meta(
        val units: Units,
        val updated_at: String
    )

    data class Units(
        val air_pressure_at_sea_level: String,
        val air_temperature: String,
        val air_temperature_max: String,
        val air_temperature_min: String,
        val air_temperature_percentile_10: String,
        val air_temperature_percentile_90: String,
        val cloud_area_fraction: String,
        val cloud_area_fraction_high: String,
        val cloud_area_fraction_low: String,
        val cloud_area_fraction_medium: String,
        val dew_point_temperature: String,
        val fog_area_fraction: String,
        val precipitation_amount: String,
        val precipitation_amount_max: String,
        val precipitation_amount_min: String,
        val probability_of_precipitation: String,
        val probability_of_thunder: String,
        val relative_humidity: String,
        val ultraviolet_index_clear_sky: String,
        val wind_from_direction: String,
        val wind_speed: String,
        val wind_speed_of_gust: String,
        val wind_speed_percentile_10: String,
        val wind_speed_percentile_90: String
    )

    data class Dataholder(
        val data: Data,
        val time: String
    )

    data class Data(
        val instant: Instant,
        val next_12_hours: Next_12_hours,
        val next_1_hours: Next_1_hours,
        val next_6_hours: Next_6_hours
    )

    data class Instant(
        val details: Details
    ) {
        data class Details(
            val air_pressure_at_sea_level: Double,
            val air_temperature: Double,
            val air_temperature_percentile_10: Double,
            val air_temperature_percentile_90: Double,
            val cloud_area_fraction: Double,
            val cloud_area_fraction_high: Double,
            val cloud_area_fraction_low: Double,
            val cloud_area_fraction_medium: Double,
            val dew_point_temperature: Double,
            val fog_area_fraction: Double,
            val relative_humidity: Double,
            val ultraviolet_index_clear_sky: Double,
            val wind_from_direction: Double,
            val wind_speed: Double,
            val wind_speed_of_gust: Double,
            val wind_speed_percentile_10: Double,
            val wind_speed_percentile_90: Double
        )
    }

    data class Next_12_hours(
        val details: Details,
        val summary: Summary
    ) {
        data class Details(
            val probability_of_precipitation: Double
        )

        data class Summary(
            val symbol_code: String,
            val symbol_confidence: String
        )
    }

    data class Next_1_hours(
        val details: Details,
        val summary: Summary
    ) {
        data class Details(
            val precipitation_amount: Double,
            val precipitation_amount_max: Double,
            val precipitation_amount_min: Double,
            val probability_of_precipitation: Double,
            val probability_of_thunder: Double
        )

        data class Summary(
            val symbol_code: String
        )
    }

    data class Next_6_hours(
        val details: Details,
        val summary: Summary
    ) {
        data class Details(
            val air_temperature_max: Double,
            val air_temperature_min: Double,
            val precipitation_amount: Double,
            val precipitation_amount_max: Double,
            val precipitation_amount_min: Double,
            val probability_of_precipitation: Double
        )

        data class Summary(
            val symbol_code: String
        )
    }
}