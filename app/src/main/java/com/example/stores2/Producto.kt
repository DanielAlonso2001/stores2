package com.example.stores2

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     
        val buttonGoToCart: Button = findViewById(R.id.button_go_to_cart)

       
        val newBalanceImageView: ImageView = findViewById(R.id.image_new_balance)
        val newBalanceNameTextView: TextView = findViewById(R.id.text_new_balance_name)
        val newBalancePriceTextView: TextView = findViewById(R.id.text_new_balance_price)

        val nikeAirJordanImageView: ImageView = findViewById(R.id.image_nike_air_jordan)
        val nikeAirJordanNameTextView: TextView = findViewById(R.id.text_nike_air_jordan_name)
        val nikeAirJordanPriceTextView: TextView = findViewById(R.id.text_nike_air_jordan_price)

        val rubiksCubeImageView: ImageView = findViewById(R.id.image_rubiks_cube)
        val rubiksCubeNameTextView: TextView = findViewById(R.id.text_rubiks_cube_name)
        val rubiksCubePriceTextView: TextView = findViewById(R.id.text_rubiks_cube_price)

        val gamingKeyboardImageView: ImageView = findViewById(R.id.image_gaming_keyboard)
        val gamingKeyboardNameTextView: TextView = findViewById(R.id.text_gaming_keyboard_name)
        val gamingKeyboardPriceTextView: TextView = findViewById(R.id.text_gaming_keyboard_price)

     
        }
    }
}
