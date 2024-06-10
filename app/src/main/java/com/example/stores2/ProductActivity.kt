package com.example.stores2

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        val buttonGoToCart: Button = findViewById(R.id.button_go_to_cart)
        data class Product(val imageViewId: Int, val nameTextViewId: Int, val priceTextViewId: Int)
        val products = listOf(
            Product(R.id.image_new_balance, R.id.text_new_balance_name, R.id.text_new_balance_price),
            Product(R.id.image_nike_air_jordan, R.id.text_nike_air_jordan_name, R.id.text_nike_air_jordan_price),
            Product(R.id.image_rubiks_cube, R.id.text_rubiks_cube_name, R.id.text_rubiks_cube_price),
            Product(R.id.image_gaming_keyboard, R.id.text_gaming_keyboard_name, R.id.text_gaming_keyboard_price)
        )

        // Initialize product views
        products.forEach { product ->
            val imageView: ImageView = findViewById(product.imageViewId)
            val nameTextView: TextView = findViewById(product.nameTextViewId)
            val priceTextView: TextView = findViewById(product.priceTextViewId)
        }
    }
}
