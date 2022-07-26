package com.vytivskyi.homework30

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vytivskyi.homework30.databinding.ActivityLinearLayoutBinding
import com.vytivskyi.homework30.databinding.ActivityMainBinding

class LinearLayout : AppCompatActivity() {
    private lateinit var binding: ActivityLinearLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLinearLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.photo.setOnClickListener{
            val i = Intent(this@LinearLayout, MainActivity::class.java)
            startActivity(i)
        }
    }
}