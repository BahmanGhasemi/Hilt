package com.example.dependencyinjection

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext

@Module
@InstallIn(ActivityComponent::class)
class AppModule {

    @Provides
    fun provideContext(@ApplicationContext context: Context){
        
    }
}