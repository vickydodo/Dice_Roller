package com.littlelemon.diceroller

/**
 * this activity allows the user to roll a dice and view the result on the screen
 */
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button5)
        rollButton.setOnClickListener { rollDice() }
//  Do a dice roll when the app starts
    }

    /**
     * Roll the dice and update the screen with the result
     */
    private fun rollDice() {
//        Create new Dice object with 6 sides and roll the dice
        val firstDice = Dice(6)
        val diceRoll = firstDice.roll()

//        find the imageview in the layout
        val diceImage: ImageView = findViewById(R.id.imageView)

        // determine which drawable resource ID to use based on the dice roll
        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
        diceImage.contentDescription = diceRoll.toString()

        val secondDice = Dice(6)
        val secondDiceRoll = secondDice.roll()
        val diceImage2: ImageView = findViewById(R.id.imageView2)
        val drawableResource2 = when (secondDiceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage2.setImageResource(drawableResource2)
        diceImage2.contentDescription = diceRoll.toString()


    }
}

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}

