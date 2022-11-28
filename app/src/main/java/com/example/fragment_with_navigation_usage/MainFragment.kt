package com.example.fragment_with_navigation_usage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.fragment_with_navigation_usage.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private lateinit var binding:FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(inflater,container,false);
        binding.btnToSecond.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.toSecond);
        }
        binding.btnToThird.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.toThird);
        }
        return binding.root;
    }
}