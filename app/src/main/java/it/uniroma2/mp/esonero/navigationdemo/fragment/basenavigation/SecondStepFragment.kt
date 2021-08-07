package it.uniroma2.mp.esonero.navigationdemo.fragment.basenavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import it.uniroma2.mp.esonero.navigationdemo.R
import it.uniroma2.mp.esonero.navigationdemo.databinding.FragmentSecondStepBinding
import it.uniroma2.mp.esonero.navigationdemo.model.User

class SecondStepFragment : Fragment() {

    private lateinit var binding: FragmentSecondStepBinding

    // oggetto in arrivo dalla navigazione
    private lateinit var user: User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentSecondStepBinding.inflate(layoutInflater)

        // recupero il parametro passato tramite navController
        user = requireArguments().getParcelable<User>("user")!!
        binding.tvName.text = user.name

        binding.btnNext.setOnClickListener {
            try {
                // recupero il valore inserito dall'utente
                user.age = binding.etAge.text.toString().toInt()

                // istanzio l'action per il passaggio tramite SafeArgs
                val action = SecondStepFragmentDirections.actionSecondStepFragmentToThirdStepFragment(user)
                // effettuo la navigazione
                findNavController().navigate(action)

            } catch (e: NumberFormatException) {
                Toast.makeText(activity, getString(R.string.secondstep_validationerror_message), Toast.LENGTH_SHORT).show()
            }
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
