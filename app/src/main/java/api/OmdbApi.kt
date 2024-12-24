package api

import retrofit2.Call
import retrofit2.http.GET

interface OmdbApi  {
    @GET(
        "?apikey=2a66aa0e" +
                "&s=Harry" +
                "&y="
    )
    fun fetchContents(): Call<FilmResponse>
}