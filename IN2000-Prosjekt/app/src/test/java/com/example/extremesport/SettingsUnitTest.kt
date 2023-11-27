package com.example.extremesport
import com.example.extremesport.screen.Setting
import org.junit.Assert
import org.junit.Test

class SettingsUnitTest {
    @Test
    fun test_settings() {
        var testVariable = 0
        val setting = Setting("Test setting") { testVariable += 1 }
        setting.onClick()
        Assert.assertEquals(1, testVariable)
    }
}
