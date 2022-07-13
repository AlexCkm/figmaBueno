package com.example.figmabueno

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.figmabueno.databinding.FragmentFigma3Binding


class figma3Fragment : Fragment() {
    private var _binding: FragmentFigma3Binding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFigma3Binding.inflate(inflater,container,false)
        return binding.root
    }

}