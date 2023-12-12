package com.whymaull.herbaid.ui.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.whymaull.herbaid.R
import com.whymaull.herbaid.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}