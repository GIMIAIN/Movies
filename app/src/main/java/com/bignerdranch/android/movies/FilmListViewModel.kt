package com.bignerdranch.android.movies

import androidx.lifecycle.ViewModel

class FilmListViewModel: ViewModel() {
    private val filmRepository = FilmRepository.get()
    val filmListLiveData = filmRepository.getFilms()
}