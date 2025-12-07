package com.example.landmarkrecognition.domain

data class Classification(
    val name: String,
    val score: Float   //To tell how acurate a model is
)
