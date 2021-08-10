package it.uniroma2.mp.esonero.navigationdemo.fragment.deeplink

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import it.uniroma2.mp.esonero.navigationdemo.databinding.FragmentDeeplinkDemoBinding

class DeeplinkDemoFragment : Fragment() {

    private lateinit var binding: FragmentDeeplinkDemoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentDeeplinkDemoBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return binding.root
    }

}
