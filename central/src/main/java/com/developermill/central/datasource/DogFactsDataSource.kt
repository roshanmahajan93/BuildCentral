package com.developermill.central.datasource

import com.developermill.central.datasource.pojos.DogFactsResModel
import okhttp3.ResponseBody
import retrofit2.Response

interface DogFactsDataSource {

    suspend fun getDogFunFacts(number: String): Response<ArrayList<DogFactsResModel>>

}