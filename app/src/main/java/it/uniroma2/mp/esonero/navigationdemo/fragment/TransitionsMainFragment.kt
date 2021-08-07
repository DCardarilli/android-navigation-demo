package it.uniroma2.mp.esonero.navigationdemo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import it.uniroma2.mp.esonero.navigationdemo.R
import it.uniroma2.mp.esonero.navigationdemo.databinding.FragmentTransitionsMainBinding


class TransitionsMainFragment : Fragment() {

    private lateinit var binding: FragmentTransitionsMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentTransitionsMainBinding.inflate(layoutInflater);

        binding.btnStartGame.setOnClickListener {
            findNavController().navigate(R.id.action_transitionsMainFragment_to_TransitionGraph)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root;
    }

}
