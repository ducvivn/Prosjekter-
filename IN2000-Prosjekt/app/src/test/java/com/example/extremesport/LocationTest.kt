package com.example.extremesport

import com.example.extremesport.data.AppDataContainer
import com.example.extremesport.view.ESViewModel
import org.junit.Assert
import org.junit.Test

class LocationTest {
    @Test
    fun locationDataTest() {
        val viewmodel = ESViewModel(null)
        Assert.assertEquals(null, viewmodel.returnLocations())
    }
}