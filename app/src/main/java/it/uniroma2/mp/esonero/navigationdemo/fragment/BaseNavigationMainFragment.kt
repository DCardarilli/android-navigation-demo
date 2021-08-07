package it.uniroma2.mp.esonero.navigationdemo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import it.uniroma2.mp.esonero.navigationdemo.R
import it.uniroma2.mp.esonero.navigationdemo.databinding.FragmentBaseNavigationMainBinding

class BaseNavigationMainFragment : Fragment() {

    private lateinit var binding: FragmentBaseNavigationMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentBaseNavigationMainBinding.inflate(layoutInflater)

        binding.btnStart.setOnClickListener {
            // navigation semplice, senza passaggio di parametri
            findNavController().navigate(R.id.action_baseNavigationMainFragmentTab_to_baseNavigationGraph)
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