package it.uniroma2.mp.esonero.navigationdemo.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import it.uniroma2.mp.esonero.navigationdemo.R

class BaseNavigationMainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_base_navigation_main, container, false)
    }

}