package com.developermill.central.datasource

import com.developermill.central.datasource.apis.CatFactsService
import com.developermill.central.datasource.apis.DogFactsService
import com.developermill.central.datasource.pojos.CatFactsResModel
import com.developermill.central.datasource.pojos.DogFactsResModel
import okhttp3.ResponseBody
import retrofit2.Response
import javax.inject.Inject

class CatFunFactsDataSourceImpl @Inject constructor(private val catFactsService: CatFactsService) :
    CatFactsDataSource {

    override suspend fun getCatFunFacts(number: Int): Response<ArrayList<CatFactsResModel>> =
        catFactsService.getCatFunFacts("cat", number)

}