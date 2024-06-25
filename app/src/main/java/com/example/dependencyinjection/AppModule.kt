package com.example.dependencyinjection

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
class AppModule {

    @RetrofitQualifier
    @Provides
    fun provideRetrofit(): NetworkService {
        return Retrofit()
    }

    @VolleyQualifier
    @Provides
    fun provideVolley(): NetworkService {
        return Volley()
    }
}