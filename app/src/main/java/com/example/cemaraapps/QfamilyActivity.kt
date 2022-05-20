package com.example.cemaraapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cemaraapps.databinding.ActivityLoginBinding
import com.example.cemaraapps.databinding.ActivityQfamilyBinding

class QfamilyActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQfamilyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQfamilyBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}