package com.example.extremesport.model

//Dette burde antakeligvis leses fra en eller annen JSON fil vi lager selv.
data class LocationData(
    val locations: List<Location>
) {
    data class Location(
        val name: String,
        val id: Int,
        val latitude: Double,
        val longitude: Double,
        val website: String,
        //Hva slags type lokasjon dette er, altså om det er en klubb eller bare en spot f.eks.
        val type: String,
        val adress: String,
        val phoneNr: String,
        val openingtime: String
    )
}