package com.example.figmabueno

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.figmabueno.databinding.FragmentFigma1Binding


class figma1Fragment : Fragment() {
    private var _binding: FragmentFigma1Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFigma1Binding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        return binding.root
    }

}