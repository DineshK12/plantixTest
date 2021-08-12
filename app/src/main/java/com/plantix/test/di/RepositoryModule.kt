package com.plantix.test.di

import com.plantix.test.repo.UsersRepository
import com.plantix.test.repo.UsersRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object RepositoryModule {

    @Provides
    @ViewModelScoped
    fun providesUsersRepository(): UsersRepository {
        return UsersRepositoryImpl()
    }
}