package com.example.project2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var wishlistRecyclerView = findViewById(R.id.wishlistRecyclerView)

        val items = listOf(
            WishlistItem("Item 1", 10.0, "https://www.example.com/item1"),
            WishlistItem("Item 2", 20.0, "https://www.example.com/item2"),
            WishlistItem("Item 3", 30.0, "https://www.example.com/item3")
        )

    }

    class WishlistItem(s: String, d: Double, s1: String) {

    }
}