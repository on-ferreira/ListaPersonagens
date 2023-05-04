package com.example.data.network.service

import com.example.listapersonagens.model.api.RickyAndMortyCharacters
import retrofit2.http.GET

interface RickyAndMortyService {
    
    @GET("character")
    suspend fun getCharacters(): com.example.listapersonagens.model.api.RickyAndMortyCharacters
    
}