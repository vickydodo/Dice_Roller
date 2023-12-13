package com.littlelemon.diceroller

import junit.framework.Assert.assertTrue
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun generates_number(){
        val dice = Dice(8)
        val diceRoll = dice.roll()
        assertTrue("The value of rollResult was not between 1 and 6", diceRoll in 1..6)
    }
}