package com.example.birddaycard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_roll: Button = findViewById(R.id.btn_roll);


        btn_roll.setOnClickListener {

            rollDice()

        }
    }

    private fun rollDice() {

        //val txt_out: TextView = findViewById(R.id.txt_out);

        val myFirstDice = Dice(12)
        val rollResult = myFirstDice.roll()
        val luckyNumber = 4
        val diceImage: ImageView = findViewById(R.id.image1)
        val diceImage2: ImageView = findViewById(R.id.image2)

        val toast = Toast.makeText(this, " "+ rollResult, Toast.LENGTH_LONG).show();
        when (rollResult) {
            1 -> {diceImage.setImageResource(R.drawable.dice_1)
                diceImage2.setImageResource(R.drawable.androidparty)}
            2 -> {diceImage.setImageResource(R.drawable.dice_1)

                diceImage2.setImageResource(R.drawable.dice_1)}
            3 -> {diceImage.setImageResource(R.drawable.dice_2)
                diceImage2.setImageResource(R.drawable.dice_1)}
            4 -> {diceImage.setImageResource(R.drawable.dice_2)
                diceImage2.setImageResource(R.drawable.dice_2)}
            5 -> {diceImage.setImageResource(R.drawable.dice_2)
                diceImage2.setImageResource(R.drawable.dice_3)}
            6 -> {diceImage.setImageResource(R.drawable.dice_3)
                diceImage2.setImageResource(R.drawable.dice_3)}
            7 -> {diceImage.setImageResource(R.drawable.dice_6)
                    diceImage2.setImageResource(R.drawable.dice_1)}
            8 -> {diceImage.setImageResource(R.drawable.dice_6)
                diceImage2.setImageResource(R.drawable.dice_2)}
            9 -> {diceImage.setImageResource(R.drawable.dice_5)
                diceImage2.setImageResource(R.drawable.dice_4)}
            10 -> {diceImage.setImageResource(R.drawable.dice_5)
                diceImage2.setImageResource(R.drawable.dice_5)}
            11 -> {diceImage.setImageResource(R.drawable.dice_6)
                diceImage2.setImageResource(R.drawable.dice_5)}
            12 -> {diceImage.setImageResource(R.drawable.dice_6)
                diceImage2.setImageResource(R.drawable.dice_6)}
        }
    }

    class Dice(private val numSides: Int) {

        /**
         * Do a random dice roll and return the result.
         */
        fun roll(): Int {
            return (1..numSides).random()
        }
    }
}