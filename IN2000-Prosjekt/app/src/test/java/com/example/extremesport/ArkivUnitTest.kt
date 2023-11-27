package com.example.extremesport
import com.example.extremesport.screen.Card
import com.example.extremesport.screen.Setting
import org.junit.Assert
import org.junit.Test

class ArkivUnitTest {
    @Test
    fun test_card() {
        val cards = listOf(
            Card("TestStation1", 1, "", false),
            Card("TestStation2", 5, "", true),
            Card("TestStation3", 5, "", true),
            Card("TestStation4", 1, "", false),
        )
        val favorites = cards.filter { it.isFavorite }
        Assert.assertEquals(2, favorites.size)
    }
}