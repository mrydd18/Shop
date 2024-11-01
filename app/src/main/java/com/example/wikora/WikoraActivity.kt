package com.example.wikora
import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.wikora.databinding.ActivityWikora2Binding


class WikoraActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWikora2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWikora2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backButton.setOnClickListener {
            finish()
        }
        val countTextView = findViewById<TextView>(R.id.countTextView)
        val decreaseButton = findViewById<Button>(R.id.decrease_button)
        val increaseButton = findViewById<Button>(R.id.increase_button)
        var currentCount = 1
        increaseButton.setOnClickListener {
            currentCount++
            countTextView.text = currentCount.toString()
        }
        decreaseButton.setOnClickListener {
            currentCount--
            countTextView.text = currentCount.toString()
            if (currentCount < 1) {
                Toast.makeText(this, "Count cannot be negative", Toast.LENGTH_SHORT).show()
                currentCount = 1
                countTextView.text = currentCount.toString()
            }
        }

        binding.orderButton.setOnClickListener {
            Toast.makeText(this, "Order is successful", Toast.LENGTH_SHORT).show()
            finish()
        }
    }

}