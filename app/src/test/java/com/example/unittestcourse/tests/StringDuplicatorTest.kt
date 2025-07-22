package com.example.unittestcourse.tests

import com.example.unittestcourse.ui.theme.tests.StringDuplicator
import junit.framework.TestCase.assertEquals
import org.junit.Test

class StringDuplicatorTest {

    private val stringDuplicator = StringDuplicator()

    @Test
    fun testDuplicateString_WithEmptyString_ReturnsEmptyString() {
        assertEquals("""""", stringDuplicator.duplicate(""))
    }
    @Test
    fun testDuplicateString_WithValidString_ReturnsDuplicateString() {
        assertEquals("hellohellohello", stringDuplicator.duplicate("hello"))
    }
}