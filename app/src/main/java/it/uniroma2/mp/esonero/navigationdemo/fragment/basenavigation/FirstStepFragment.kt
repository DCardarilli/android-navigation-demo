package it.uniroma2.mp.esonero.navigationdemo.fragment.basenavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import it.uniroma2.mp.esonero.navigationdemo.databinding.FragmentFirstStepBinding
import it.uniroma2.mp.esonero.navigationdemo.model.User
import it.uniroma2.mp.esonero.navigationdemo.R

class FirstStepFragment : Fragment() {

    private lateinit var binding: FragmentFirstStepBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentFirstStepBinding.inflate(layoutInflater)

        binding.btnNext.setOnClickListener {
            // Passaggio di parametri tramite bundle

            // istanzio l'oggetto da passare
            val user = User()
            // lo valorizzo con l'input dell'utente
            user.name = binding.etName.text.toString()

            // creo il bundle da passare alla destination
            val bundle = bundleOf("user" to user)
            // effettuo la navigazione passando il bundle
            findNavController().navigate(R.id.action_firstStepFragment_to_secondStepFragment, bundle)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return binding.root
    }

}
