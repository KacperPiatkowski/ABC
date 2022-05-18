package com.example.abc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var licznik = 1;


        findViewById<Button>(R.id.backButton).setOnClickListener {
            if(licznik == 1)
                licznik = 5;
            else licznik -= 1;

            if(licznik == 1)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.obrazek);
            else if(licznik == 2)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.obrazek1);
            else if(licznik == 3)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.obrazek2);
            else if(licznik == 4)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.obrazek3);
            else if(licznik == 5)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.obrazek4);
        }

            if(licznik == 5)
                licznik = 1;
            else
                licznik += 1;

            if(licznik == 1)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.obrazek);
            else if(licznik == 2)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.obrazek1);
            else if(licznik == 3)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.obrazek2);
            else if(licznik == 4)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.obrazek3);
            else if(licznik == 5)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.obrazek4);
        }
    }

