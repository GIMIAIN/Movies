package com.bignerdranch.android.movies

import android.app.Application

class FilmSearchApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        FilmRepository.initialize(this)
    }
}