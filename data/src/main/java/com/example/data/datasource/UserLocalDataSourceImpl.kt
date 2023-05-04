package com.example.data.datasource

import android.content.Context
import com.example.data.model.User
import com.example.data.network.authentication.registeredUsers
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class UserLocalDataSourceImpl @Inject constructor(
    @ApplicationContext private val context: Context
): UserLocalDataSource {
    
    override fun getUser(): User {
        return registeredUsers.last()
    }
    
}