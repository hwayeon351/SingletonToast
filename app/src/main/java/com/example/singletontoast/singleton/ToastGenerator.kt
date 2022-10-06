package com.example.singletontoast.singleton

import android.content.Context
import android.view.LayoutInflater
import android.widget.Toast
import com.example.singletontoast.databinding.ToastType1Binding
import com.example.singletontoast.databinding.ToastType2Binding

object ToastGenerator {
    private val context: Context by lazy {
        App.context
    }

    fun createToastMessage(msg: String, type: Int) {
        val toast = Toast(context)
        when (type) {
            //activity toast
            0 -> {
                val binding = ToastType1Binding.inflate(LayoutInflater.from(context))
                binding.textView.text = msg
                toast.let {
                    it.view = binding.root
                    it.show()
                }
            }
            //fragment toast
            1 -> {
                val binding = ToastType2Binding.inflate(LayoutInflater.from(context))
                binding.textView.text = msg
                toast.let {
                    it.view = binding.root
                    it.show()
                }
            }
        }
    }
}