package com.example.listapersonagens.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listapersonagens.databinding.ActivityMainBinding
import com.example.listapersonagens.model.domain.InMemoryUserRepository
import com.example.listapersonagens.model.domain.User
import com.example.listapersonagens.network.authentication.BackendAuthenticator

class MainActivity : AppCompatActivity() {
    
    private lateinit var binding: ActivityMainBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }
    
}
