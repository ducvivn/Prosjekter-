package com.example.extremesport

import com.example.extremesport.model.RequirementsResult
import com.example.extremesport.view.ESViewModel
import org.junit.Assert
import org.junit.Test

class GetInfoTest {
    @Test
    fun testGetInfo() {
        val viewmodel = ESViewModel(null)
        val info = viewmodel.getInfo()
    }
}