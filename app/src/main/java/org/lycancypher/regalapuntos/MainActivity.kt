package org.lycancypher.regalapuntos

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.FirebaseApp
import org.lycancypher.regalapuntos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var prefs: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)

        prefs = getSharedPreferences("SHARED_PREFS", Context.MODE_PRIVATE)
        val editor = prefs.edit()
        editor.putBoolean("LOGED_USER", false)
        editor.apply()

        FirebaseApp.initializeApp(this)

        val loged = this.prefs.getBoolean("LOGED_USER", true)
        if (!loged) {

        }

        
    }
}