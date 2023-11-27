package com.example.extremesport

import com.example.extremesport.data.DataSource
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Test

class APIUnitTest {
    @Test
    fun sunrise_isCorrect() {
        val dataSource = DataSource()
        var sunriseTest = runBlocking { dataSource.getSunrise(59.933333,10.716667,"2022-12-18","+01:00") }
        Assert.assertEquals("MET Norway", sunriseTest.copyright)
        Assert.assertEquals("Feature", sunriseTest.type)
        Assert.assertEquals("Point", sunriseTest.geometry.type)
        Assert.assertEquals(true, sunriseTest.geometry.coordinates[0] == 10.7 && sunriseTest.geometry.coordinates[1] == 59.9)

        sunriseTest = runBlocking { dataSource.getSunrise(59.633333,10.616667,"2022-12-18","+01:00") }
        Assert.assertEquals("MET Norway", sunriseTest.copyright)
        Assert.assertEquals("Feature", sunriseTest.type)
        Assert.assertEquals("Point", sunriseTest.geometry.type)
        Assert.assertEquals(true, sunriseTest.geometry.coordinates[0] == 10.6 && sunriseTest.geometry.coordinates[1] == 59.6)
    }

    @Test
    fun nowcast_isCorrect() {
        val dataSource = DataSource()
        var nowcastTest = runBlocking { dataSource.getNowcast(59.933333, 10.716667) }
        Assert.assertEquals("Feature", nowcastTest.type)
        Assert.assertEquals("Point", nowcastTest.geometry.type)
        Assert.assertEquals(true, nowcastTest.geometry.coordinates[0] == 10.7167 && nowcastTest.geometry.coordinates[1] == 59.9333)

        nowcastTest = runBlocking { dataSource.getNowcast(59.633333, 10.616667) }
        Assert.assertEquals("Feature", nowcastTest.type)
        Assert.assertEquals("Point", nowcastTest.geometry.type)
        Assert.assertEquals(true, nowcastTest.geometry.coordinates[0] == 10.6167 && nowcastTest.geometry.coordinates[1] == 59.6333)
    }

    @Test
    fun locationForecast_isCorrect() {
        val dataSource = DataSource()
        var locationForecastTest = runBlocking { dataSource.getLocationForecast(1,59.911491,10.757933) }
        Assert.assertEquals("Feature", locationForecastTest.type)
        Assert.assertEquals("Point", locationForecastTest.geometry.type)
        Assert.assertEquals(true, locationForecastTest.geometry.coordinates[0] == 10.7579 && locationForecastTest.geometry.coordinates[1] == 59.9115)

        locationForecastTest = runBlocking { dataSource.getLocationForecast(1,59.611491,10.657933) }
        Assert.assertEquals("Feature", locationForecastTest.type)
        Assert.assertEquals("Point", locationForecastTest.geometry.type)
        Assert.assertEquals(true, locationForecastTest.geometry.coordinates[0] == 10.6579 && locationForecastTest.geometry.coordinates[1] == 59.6115)
    }

    @Test
    fun openAddress_isCorrect() {
        val dataSource = DataSource()
        var openAddress = runBlocking { dataSource.getOpenAddress(59.911491, 10.757933, 1000) }
        if (openAddress != null) {
            Assert.assertEquals(0, openAddress.metadata.side)
        }
        if (openAddress != null) {
            Assert.assertEquals(true, openAddress.metadata.asciiKompatibel)
        }
        if (openAddress != null) {
            Assert.assertEquals("Schweigaards gate", openAddress.adresser[0].adressenavn)
        }

        openAddress = runBlocking { dataSource.getOpenAddress(59.611491, 10.757933, 1000) }
        if (openAddress != null) {
            Assert.assertEquals(0, openAddress.metadata.side)
        }
        if (openAddress != null) {
            Assert.assertEquals(true, openAddress.metadata.asciiKompatibel)
        }
        if (openAddress != null) {
            Assert.assertEquals("Støttumveien", openAddress.adresser[0].adressenavn)
        }
    }
}