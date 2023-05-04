package com.example.data.network.service

import com.example.listapersonagens.model.api.DisneyCharactersResult
import retrofit2.http.GET

interface DisneyService {
    
    @GET("characters")
    suspend fun getCharacters(): com.example.listapersonagens.model.api.DisneyCharactersResult
    
}