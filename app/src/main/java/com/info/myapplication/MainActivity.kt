package com.info.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollText : TextView = findViewById(R.id.rollText)
        val againText : TextView = findViewById(R.id.againText)
        val rollButton : Button = findViewById(R.id.rollButton)
        val clearButton : Button = findViewById(R.id.clearButton)
        val diceImage1 : ImageView = findViewById(R.id.diceImage1)
        val diceImage2 : ImageView = findViewById(R.id.diceImage2)

        rollButton.setOnClickListener {
            val number1 = (1..6).random()
            val number2 = (1..6).random()
            val text : String = "Zar atıldı"
            rollText.text = text.toString()

            if (number1 != number2) {
                when (number1) {
                    1 -> diceImage1.setImageResource(R.drawable.dice_1)
                    2 -> diceImage1.setImageResource(R.drawable.dice_2)
                    3 -> diceImage1.setImageResource(R.drawable.dice_3)
                    4 -> diceImage1.setImageResource(R.drawable.dice_4)
                    5 -> diceImage1.setImageResource(R.drawable.dice_5)
                    6 -> diceImage1.setImageResource(R.drawable.dice_6)
                }
                when (number2) {
                    1 -> diceImage2.setImageResource(R.drawable.dice_1)
                    2 -> diceImage2.setImageResource(R.drawable.dice_2)
                    3 -> diceImage2.setImageResource(R.drawable.dice_3)
                    4 -> diceImage2.setImageResource(R.drawable.dice_4)
                    5 -> diceImage2.setImageResource(R.drawable.dice_5)
                    6 -> diceImage2.setImageResource(R.drawable.dice_6)
                }
            } else {
                val text1 : String = "tekrar atınız"
               againText.text = text1.toString()

            }

        }

        clearButton.setOnClickListener {
            diceImage1.setImageResource(R.drawable.empty_dice)
            diceImage2.setImageResource(R.drawable.empty_dice)
        }

    }
}