package com.murside.mynavigationapp

import android.os.Bundle
import android.text.Layout.Directions
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.murside.mynavigationapp.databinding.FragmentBirinciBinding


class BirinciFragment : Fragment() {
    private var _binding : FragmentBirinciBinding?= null
    private  val binding get( )= _binding!!



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
    _binding=FragmentBirinciBinding.inflate(inflater,container,false)
    val view=binding.root
        return view
    }
    fun sonraki(view:View){
        val isim=binding.editText.text.toString()
    val action=BirinciFragmentDirections.actionBirinciFragmentToIkinciFragment(isim)
        Navigation.findNavController(view).navigate(action)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.editText.setText(" ")
        binding.button.setOnClickListener{
            sonraki(it)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }


}