package com.example.cemaraapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cemaraapps.databinding.ActivityDetailBinding
import com.example.cemaraapps.databinding.ActivityLoginBinding
import java.util.*

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val kodeFix = randomCode()
        binding.kode.text = kodeFix

    }
    private fun randomCode(): String {
        val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        val charArray = CharArray(4)
        val random = Random()
        for (i in 0..3) {
            val randomInt = random.nextInt(alphabet.length)
            charArray[i] = alphabet[randomInt]
        }
        return charArray.joinToString("")
    }



}