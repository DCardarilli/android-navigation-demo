package it.uniroma2.mp.esonero.navigationdemo

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var supra: Button = findViewById(R.id.Sopra)
        supra.isEnabled = false
        var sotto: Button = findViewById(R.id.Sotto)
        sotto.isEnabled = false
        var sinistra: Button = findViewById(R.id.tastosinistro1)
        sinistra.isEnabled = false
        var destra: Button = findViewById(R.id.Destra)
        destra.isEnabled = false

        var startgame: Button = findViewById(R.id.startgame)
        startgame.setOnClickListener {
            supra.isEnabled = true
            sotto.isEnabled = true
            sinistra.isEnabled = true
            destra.isEnabled = true
            startgame.isVisible = false


        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }


}