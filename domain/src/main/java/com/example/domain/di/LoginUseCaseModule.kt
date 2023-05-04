package com.example.domain.di

import com.example.data.repository.UserRepository
import com.example.domain.usecase.GetProfileUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object LoginUseCaseModule {

    @Provides
    fun providesGetProfileUseCase(
        userRepository: UserRepository
    ): GetProfileUseCase {
        return GetProfileUseCase(userRepository)
    }
}
