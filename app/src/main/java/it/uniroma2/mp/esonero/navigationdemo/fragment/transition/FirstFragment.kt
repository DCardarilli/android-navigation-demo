package it.uniroma2.mp.esonero.navigationdemo.fragment.transition

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import it.uniroma2.mp.esonero.navigationdemo.R

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(

            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // view.findViewById<Button>(R.id.Sopra).isEnabled=false

        view.findViewById<Button>(R.id.Destra).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
            view.findViewById<Button>(R.id.Sopra).setOnClickListener {
                findNavController().navigate(R.id.action_FirstFragment_to_upfragment)
            }
            view.findViewById<Button>(R.id.tastosinistro1).setOnClickListener {
                findNavController().navigate(R.id.action_FirstFragment_to_third)
            }
            view.findViewById<Button>(R.id.Sotto).setOnClickListener {
                findNavController().navigate(R.id.action_FirstFragment_to_downfragment)
            }
        }
    }