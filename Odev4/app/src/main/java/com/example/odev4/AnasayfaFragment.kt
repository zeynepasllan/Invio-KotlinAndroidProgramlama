 package com.example.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev4.databinding.FragmentAnasayfaBinding
import com.google.android.material.snackbar.Snackbar

 class AnasayfaFragment : Fragment() {
    private lateinit var tasarim:FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        tasarim = FragmentAnasayfaBinding.inflate(inflater, container, false)

        tasarim.buttonA.setOnClickListener {
            //Snackbar.make(it,"Merhaba",Snackbar.LENGTH_SHORT).show()
            Navigation.findNavController(it).navigate(R.id.action_anasayfaFragment_to_sayfaAFragment)
        }
        tasarim.buttonX.setOnClickListener {
            //Snackbar.make(it,"Merhaba",Snackbar.LENGTH_SHORT).show()
            Navigation.findNavController(it).navigate(R.id.action_anasayfaFragment_to_sayfaXFragment)
        }
        return tasarim.root
    }
}