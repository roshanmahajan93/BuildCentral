package com.developermill.central.datasource.pojos

import com.google.gson.annotations.SerializedName

data class CatFactsResModel(
    @SerializedName("text")
    var fact: String? = null
)