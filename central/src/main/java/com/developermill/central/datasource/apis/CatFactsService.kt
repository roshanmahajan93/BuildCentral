package com.developermill.central.datasource.apis

import com.developermill.central.datasource.pojos.CatFactsResModel
import com.developermill.central.datasource.pojos.DogFactsResModel
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface CatFactsService {

    @GET("/facts/random")
    suspend fun getCatFunFacts(
        @Query("animal_type") animalType: String = "cat",
        @Query("amount") number: Int
    ): Response<ArrayList<CatFactsResModel>>


}