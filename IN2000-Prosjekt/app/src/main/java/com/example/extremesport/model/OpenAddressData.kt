package com.example.extremesport.model

data class OpenAddressData(
    val metadata: Metadata,
    val adresser: List<Adresse>
) {
    data class Metadata(
        val side: Int,
        val treffPerSide: Int,
        val totaltAntallTreff: Int,
        val viserTil: Int,
        val sokeStreng: String,
        val asciiKompatibel: Boolean,
        val viserFra: String
    )
    data class Adresse(
        val adressenavn: String,
        val adressetekst: String,
        val adressetilleggsnavn: String,
        val adressekode: Int,
        val nummer: Int,
        val bokstav: String,
        val kommunenummer: String,
        val kommunenavn: String,
        val gardsnummer: Int,
        val bruksnummer: Int,
        val festenummer: Int,
        val undernummer: Int,
        val bruksenhetsnummer: List<String>,
        val objtype: String,
        val poststed: String,
        val postnummer: String,
        val adressetekstutenadressetilleggsnavn: String,
        val stedfestingverifisert: Boolean,
        val representasjonspunkt: Representasjonspunkt,
        val oppdateringsdato: String,
        val meterDistanseTilPunkt: Double
    )

    data class Representasjonspunkt(
        val epsg: String,
        val lat: Double,
        val lon: Double
    )
}