package com.murside.mynavigationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.murside.mynavigationapp.databinding.FragmentBirinciBinding
import com.murside.mynavigationapp.databinding.FragmentIkinciBinding


class ikinciFragment : Fragment() {
    private var _binding : FragmentIkinciBinding?= null
    private  val binding get( )= _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding=FragmentIkinciBinding.inflate(inflater,container,false)
        val view=binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
           val isim= ikinciFragmentArgs.fromBundle(it).kullaiciismi
            binding.textView.text=isim
        }
    }

}