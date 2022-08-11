package com.example.kotlin_project_diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val roll_dice_button :Button = findViewById(R.id.roll_dice);

        roll_dice_button.setOnClickListener(View.OnClickListener {
            Dice_image()
        })
    }

    private fun Dice_image() {
        val imagesource : ImageView = findViewById(R.id.image_dice)
        val resultss= when(Random().nextInt(6)+1)
        {
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5 ->R.drawable.dice_5

            else -> R.drawable.dice_6
        }
        imagesource.setImageResource(resultss)
    }
}