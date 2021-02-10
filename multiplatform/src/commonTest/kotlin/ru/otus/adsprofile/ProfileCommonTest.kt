package ru.otus.adsprofile

import kotlin.test.Test
import kotlin.test.assertEquals

internal class ProfileCommonTest {

    @Test
    fun profileTest() {
        val profile = ProfileCommon("id", "defaultName")
        assertEquals("id", profile.id)
        assertEquals("defaultName", profile.name)
    }
}