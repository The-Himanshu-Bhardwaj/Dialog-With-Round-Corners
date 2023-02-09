package com.example.dialogtesssst

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.dialogtesssst.databinding.ActivityMainBinding
import com.skydoves.transformationlayout.TransformationCompat

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fab.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            TransformationCompat.startActivity(binding.transformationLayout, intent)
        }

        binding.myCardView.setOnClickListener {
            binding.transformationLayout.finishTransform()
        }


    }
}