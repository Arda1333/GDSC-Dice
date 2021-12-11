package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rastgele = Random.nextInt(1, 6)

        val number = findViewById(R.id.numara) as TextView

        number.text = rastgele.toString()

    }

    fun zarAtma(v: View){
        var rastgele = Random.nextInt(1, 7)

        val viewImage = findViewById(R.id.image1) as ImageView

        val number = findViewById(R.id.numara) as TextView

        if(rastgele == 1){
            viewImage.setImageResource(R.drawable.dice_1)
        }

        else if(rastgele == 2){
            viewImage.setImageResource(R.drawable.dice_2)
        }

        else if(rastgele == 3){
            viewImage.setImageResource(R.drawable.dice_3)
        }

        else if(rastgele == 4){
            viewImage.setImageResource(R.drawable.dice_4)
        }

        else if(rastgele == 5){
            viewImage.setImageResource(R.drawable.dice_5)
        }

        else if(rastgele == 6){
            viewImage.setImageResource(R.drawable.dice_6)
        }

        number.text = rastgele.toString()
    }

    fun reset(v: View){
        val viewImage = findViewById(R.id.image1) as ImageView
        val number = findViewById(R.id.numara) as TextView
        viewImage.setImageResource(R.drawable.dsc_2)
        number.text = "GDSC-METU"
    }
}