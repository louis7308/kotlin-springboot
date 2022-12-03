package com.example.daegu.domain.sport.presentation.dto.request

import com.example.daegu.domain.sport.SportEntity
import com.example.daegu.domain.user.UserEntity

class ScorePredictionRequest(
    val index: Int,
    val country: String,
    val score: Int,
    val name: String
) {

}