package com.gustavoraposo.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonRoll.setOnClickListener {
            rollDice()
        }

        buttonReset.setOnClickListener {
            reset()
        }
    }

    private fun rollDice(){
        val drawable0 = when ((1..6).random()){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        val drawable1 = when ((1..6).random()){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        imageViewDice0.setImageResource(drawable0)
        imageViewDice1.setImageResource(drawable1)
    }

    private fun reset(){
        imageViewDice0.setImageResource(R.drawable.empty_dice)
        imageViewDice1.setImageResource(R.drawable.empty_dice)
    }
}