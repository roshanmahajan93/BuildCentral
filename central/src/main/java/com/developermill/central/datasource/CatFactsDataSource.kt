package com.developermill.central.datasource

import com.developermill.central.datasource.pojos.CatFactsResModel
import com.developermill.central.datasource.pojos.DogFactsResModel
import okhttp3.ResponseBody
import retrofit2.Response

interface CatFactsDataSource {

    suspend fun getCatFunFacts(number: Int): Response<ArrayList<CatFactsResModel>>

}