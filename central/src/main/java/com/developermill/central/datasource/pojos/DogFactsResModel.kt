package com.developermill.central.datasource.pojos

import com.google.gson.annotations.SerializedName

data class DogFactsResModel(
    @SerializedName("fact")
    var fact: String? = null
)