package com.bangkit.freshgrocie.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bangkit.freshgrocie.R
import com.bangkit.freshgrocie.databinding.ActivityNutritionBinding

class NutritionActivity : AppCompatActivity() {
    private lateinit var binding : ActivityNutritionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNutritionBinding.inflate(layoutInflater)

        binding.backButton.setOnClickListener {
            startActivity(Intent(applicationContext, CameraActivity::class.java))
        }
        setContentView(binding.root)
    }

}