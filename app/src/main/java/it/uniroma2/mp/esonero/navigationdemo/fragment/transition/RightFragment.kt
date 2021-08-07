package it.uniroma2.mp.esonero.navigationdemo.fragment.transition

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import it.uniroma2.mp.esonero.navigationdemo.R
import it.uniroma2.mp.esonero.navigationdemo.databinding.FragmentTransitionsRightBinding

class RightFragment : Fragment() {

    private lateinit var binding: FragmentTransitionsRightBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentTransitionsRightBinding.inflate(layoutInflater)

        binding.btnAction.setOnClickListener {
            findNavController().navigate(R.id.action_RightFragment_to_TransitionHome)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

}
