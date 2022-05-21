package com.example.cemaraapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cemaraapps.databinding.ActivityDetailBinding
import com.example.cemaraapps.databinding.ActivityPopupNoBinding
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.ktx.Firebase
import java.util.*

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    private lateinit var binding2 : ActivityPopupNoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val databaseFam = FirebaseDatabase.getInstance("https://cemaraapps-default-rtdb.firebaseio.com/")
        val kodeFix = randomCode()


        var famname = binding2.etInputFamily.toString()
        binding.apply {
            nameFam.text = famname
            tokenFam.text = kodeFix
        }


    }


    private fun randomCode():String{
        val alphabet= "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        val charArray=CharArray(4)
        val random = Random()
        for(i in 0..3){
            val randomlnt= random.nextInt(alphabet.length)
            charArray[i]=alphabet[randomlnt]
        }
        return charArray.joinToString("")
    }
}