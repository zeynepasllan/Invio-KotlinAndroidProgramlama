 package com.example.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.odev4.databinding.FragmentSayfaXBinding
import com.example.odev4.databinding.FragmentSayfaYBinding

 class SayfaYFragment : Fragment() {
    private lateinit var tasarim: FragmentSayfaYBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        tasarim = FragmentSayfaYBinding.inflate(inflater, container, false)

        return tasarim.root
    }
}