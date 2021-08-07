package it.uniroma2.mp.esonero.navigationdemo.fragment.basenavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import it.uniroma2.mp.esonero.navigationdemo.databinding.FragmentThirdStepBinding
import it.uniroma2.mp.esonero.navigationdemo.model.User

class ThirdStepFragment : Fragment() {

    private lateinit var binding: FragmentThirdStepBinding

    // istanza dei parametri passati tramite safeargs
    val args: ThirdStepFragmentArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentThirdStepBinding.inflate(layoutInflater)

        // recupero dell'oggetto passato tramite safeargs
        val user: User = args.user;

        binding.tvName.text = user.name
        binding.tvAge.text = user.age.toString()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return binding.root
    }

}
