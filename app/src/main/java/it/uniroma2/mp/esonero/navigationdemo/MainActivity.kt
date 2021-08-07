package it.uniroma2.mp.esonero.navigationdemo

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import it.uniroma2.mp.esonero.navigationdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // set up navcontroller per la bottom tab bar
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = navHostFragment.navController
        NavigationUI.setupWithNavController(binding.bnvMainTabs, navController);
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)

        // nascode il menu dalla barra in alto
        menu.findItem(R.id.baseNavigationMainFragmentTab).setVisible(false)
        menu.findItem(R.id.transitionsMainFragmentTab).setVisible(false)

        return true
    }

}
