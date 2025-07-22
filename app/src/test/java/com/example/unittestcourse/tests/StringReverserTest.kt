package com.example.unittestcourse.tests

import com.example.unittestcourse.ui.theme.tests.StringReverser
import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test

class StringReverserTest {

    private lateinit var stringReverser: StringReverser

    @Before
    fun setup() {
        stringReverser = StringReverser()
    }

    @Test
    fun testReverseString_WithEmptyString_ReturnEmptyString() {
        assertEquals("", stringReverser.reverse(""))
    }

    @Test
    fun testReverseString_WithValidString_ReturnReverseValidString() {
        val car = "Honda fit 2025"
        assertEquals("5202 tif adnoH", StringReverser().reverse(car))
    }
}