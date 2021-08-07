package it.uniroma2.mp.esonero.navigationdemo.fragment.transition

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import it.uniroma2.mp.esonero.navigationdemo.R
import it.uniroma2.mp.esonero.navigationdemo.databinding.FragmentTransitionsHomeBinding

class TransitionHomeFragment : Fragment() {

    private lateinit var binding: FragmentTransitionsHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentTransitionsHomeBinding.inflate(layoutInflater)

        binding.btnUp.setOnClickListener {
            findNavController().navigate(R.id.action_TransitionHome_to_UpFragment)
        }

        binding.btnRight.setOnClickListener {
            findNavController().navigate(R.id.action_TransitionHome_to_RightFragment)
        }

        binding.btnDown.setOnClickListener {
            findNavController().navigate(R.id.action_TransitionHome_to_DownFragment)
        }

        binding.btnLeft.setOnClickListener {
            findNavController().navigate(R.id.action_TransitionHome_to_LeftFragment)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

}
