package dev.alimansour.tmdbclient.presentation.di.component

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import dev.alimansour.tmdbclient.presentation.di.module.*
import javax.inject.Singleton

/**
 * TMDB Client Android Application developed by: Ali Mansour
 * Copyright © 2020 Ali Mansour. All Rights Reserved.
 * This file may not be redistributed in whole or significant part.
 * ----------------- TMDB Client IS FREE SOFTWARE ------------------
 * https://www.alimansour.dev   |   dev.ali.mansour@gmail.com
 */
@Singleton
@Component(
    modules = [
        AppModule::class,
        RetrofitModule::class,
        RoomModule::class,
        RepositoryModule::class,
        RemoteDataModule::class,
        LocalDataModule::class,
        CacheDataModule::class
    ]
)
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun context(context: Context): Builder

        fun build(): AppComponent
    }

    fun movieSubComponent(): MovieSubComponent.Builder
    fun tvShowSubComponent(): TVShowSubComponent.Builder
    fun artistSubComponent(): ArtistSubComponent.Builder
}