package com.example.singletontoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.singletontoast.databinding.ActivityMainBinding
import com.example.singletontoast.singleton.ToastGenerator

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .replace(binding.frameLayout.id, Fragment())
            .commit()

        binding.toastBtn.setOnClickListener {
            ToastGenerator.createToastMessage("activity!!", 0)
        }
    }
}