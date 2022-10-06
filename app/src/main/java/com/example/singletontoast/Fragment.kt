package com.example.singletontoast

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.singletontoast.databinding.FragmentBinding
import com.example.singletontoast.singleton.ToastGenerator

class Fragment : Fragment(R.layout.fragment) {
    private var binding: FragmentBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragmentBinding = FragmentBinding.bind(view)
        binding = fragmentBinding

        binding!!.toastBtn.setOnClickListener {
            ToastGenerator.createToastMessage("fragment!!", 1)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}