package com.developermill.central.datasource

import com.developermill.central.datasource.apis.DogFactsService
import com.developermill.central.datasource.pojos.DogFactsResModel
import okhttp3.ResponseBody
import retrofit2.Response
import javax.inject.Inject

class DogFunFcatsDataSourceImpl @Inject constructor(private val dogFactsService: DogFactsService) :
    DogFactsDataSource {

    override suspend fun getDogFunFacts(number: String): Response<ArrayList<DogFactsResModel>> =
        dogFactsService.getDogFunFacts(number)


}