package com.example.firebaseauthapp


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DasshboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dasshboard)

        val buttonPhones: Button = findViewById(R.id.buttonPhones)
        buttonPhones.setOnClickListener {
            val intent = Intent(this, PhonesActivity::class.java)
            startActivity(intent)

            val buttonAccessories: Button = findViewById(R.id.buttonAccessories)
            buttonAccessories.setOnClickListener {
                val intent = Intent(this, AccessoriesActivity::class.java)
                startActivity(intent)

            }
        }
    }
}
