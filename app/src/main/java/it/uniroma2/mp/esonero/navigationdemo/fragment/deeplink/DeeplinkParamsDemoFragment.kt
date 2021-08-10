package it.uniroma2.mp.esonero.navigationdemo.fragment.deeplink

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import it.uniroma2.mp.esonero.navigationdemo.databinding.FragmentDeeplinkParamsDemoBinding
import it.uniroma2.mp.esonero.navigationdemo.fragment.basenavigation.ThirdStepFragmentArgs

class DeeplinkParamsDemoFragment : Fragment() {

    private lateinit var binding: FragmentDeeplinkParamsDemoBinding

    val args: DeeplinkParamsDemoFragmentArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentDeeplinkParamsDemoBinding.inflate(layoutInflater)

        // recupero parametri passati tramite l'url (deeplink)
        val name = args.name
        binding.tvParams.text = name
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return binding.root
    }

}
