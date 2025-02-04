package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)



        12
        var editText1 = ""
        var editText2 = ""

        binding.ButtonSum.setOnClickListener {
            editText1 = binding.Number1.text.toString()
            editText2 = binding.Number2.text.toString()
            if (editText1 == "" || editText2 == "") {
                binding.TextResult.text = "NOT Result"
            } else {
                val result = editText1.toInt() + editText2.toInt()
                binding.TextResult.text = result.toString()
            }
        }
        binding.MausButton.setOnClickListener {
            editText1 = binding.Number1.text.toString()
            editText2 = binding.Number2.text.toString()
            if (editText1 == "" || editText2 == "") {
                binding.TextResult.text = "NOT Result"
            } else {
                val result = editText1.toInt() - editText2.toInt()
                binding.TextResult.text = result.toString()
            }
        }
        binding.UmozhButton.setOnClickListener {
            editText1 = binding.Number1.text.toString()
            editText2 = binding.Number2.text.toString()
            if (editText1 == "" || editText2 == "") {
                binding.TextResult.text = "NOT Result"
            } else {
                val result = editText1.toInt() * editText2.toInt()
                binding.TextResult.text = result.toString()
            }
        }
        binding.DelenieButton.setOnClickListener {
            editText1 = binding.Number1.text.toString()
            editText2 = binding.Number2.text.toString()
            if (editText1 == "" || editText2 == "") {
                binding.TextResult.text = "NOT Result"
            } else {
                val result = editText1.toInt() / editText2.toInt()
                binding.TextResult.text = result.toString()
            }

        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}



