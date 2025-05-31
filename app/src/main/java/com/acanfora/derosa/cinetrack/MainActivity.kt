package com.acanfora.derosa.cinetrack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.acanfora.derosa.cinetrack.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Mostra un messaggio di benvenuto personalizzato
        Toast.makeText(this, "Benvenuto in CineTrack!", Toast.LENGTH_SHORT).show()

        // TODO: Qui verrà caricata la lista dei film tramite TMDB API
    }
}