package com.example.dependencyinjection

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
class NetworkModule {
    @Provides
    fun provideNetworkService(): NetworkService {
        return Retrofit.Builder()
            .url("google.com")
            .protocol("https")
            .converter("GsonFactory")
            .build()
    }
}