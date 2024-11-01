package com.example.wikora

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.wikora.databinding.ActivityMainBinding
import com.example.wikora.databinding.ActivityWikora2Binding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.continueButton.setOnClickListener {
            if (
                binding.emailInput.text.toString().isEmpty() ||
                binding.passwordInput.text.toString().isEmpty()
            ) {
                Toast.makeText(this,
                    "Empty fields are not allowed!",
                    Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
                else if (
                    binding.passwordInput.text.toString().length < 8
                ){
                    Toast.makeText(this,
                        "Password must be at least 8 characters!",
                        Toast.LENGTH_SHORT).show()
                }
                else{
                    val intent = Intent(this, WikoraActivity::class.java)
                    startActivity(intent)
                    Toast.makeText(this,
                        "Logged in successfully!",
                        Toast.LENGTH_SHORT).show()

                    }
        }
    }
}

// Call the function
//
//        super.onStart()
//    }
//
//    override fun onResume() {
//        super.onResume()
//    }
//
//    override fun onPause() {
//        super.onPause()
//    }
//
//    override fun onStop() {
//        super.onStop()
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//    }
//    }
