package com.example.unittestcourse.tests

import com.example.unittestcourse.ui.theme.tests.PositiveNumberValidator
import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Before
import org.junit.Test

class PositiveNumberValidatorTest {

    private lateinit var positiveNumberValidator: PositiveNumberValidator

    @Before
    fun setup() {
        positiveNumberValidator = PositiveNumberValidator()
    }

    @Test
    fun test1() {
        val result = positiveNumberValidator.isPositive(-1)
        assertFalse(result)
    }

    @Test
    fun test2() {
        val result = positiveNumberValidator.isPositive(2)
        assertTrue(result)
    }

    @Test
    fun test3() {
        val result = positiveNumberValidator.isPositive(0)
        assertFalse(result)
    }
}