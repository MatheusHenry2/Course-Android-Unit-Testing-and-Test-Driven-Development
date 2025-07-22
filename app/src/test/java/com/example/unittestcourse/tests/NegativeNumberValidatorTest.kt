package com.example.unittestcourse.tests

import com.example.unittestcourse.ui.theme.tests.NegativeNumberValidator
import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Before
import org.junit.Test

class NegativeNumberValidatorTest {

    private lateinit var negativeNumberValidator: NegativeNumberValidator

    @Before
    fun setup(){
        negativeNumberValidator = NegativeNumberValidator()
    }

    @Test
    fun testIsNegativeNumber_WithPositiveNumber_ReturnFalse(){
        assertFalse(negativeNumberValidator.isNegative(1))
    }

    @Test
    fun testIsNegativeNumber_WithNegativeNumber_ReturnTrue(){
        assertTrue(negativeNumberValidator.isNegative(-1))
    }

    @Test
    fun testIsNegativeNumber_WithZero_ReturnFalse(){
        assertTrue(negativeNumberValidator.isNegative(0))
    }
}