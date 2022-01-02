package com.example.habitinstall

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.habitinstall.databinding.FragmentMainBinding

class MainFragment: ViewBindingFragment<FragmentMainBinding>(FragmentMainBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}