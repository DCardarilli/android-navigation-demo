package it.uniroma2.mp.esonero.navigationdemo.fragment.transition

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import it.uniroma2.mp.esonero.navigationdemo.R
import it.uniroma2.mp.esonero.navigationdemo.databinding.FragmentTransitionsDownBinding

class DownFragment : Fragment() {

    private lateinit var binding: FragmentTransitionsDownBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentTransitionsDownBinding.inflate(layoutInflater)

        binding.btnAction.setOnClickListener {
            findNavController().navigate(R.id.action_DownFragment_to_TransitionHome)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

}
