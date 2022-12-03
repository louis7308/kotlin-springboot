package com.example.daegu.domain.sport.presentation

import com.example.daegu.domain.sport.SportEntity
import com.example.daegu.domain.sport.presentation.dto.request.ScorePredictionRequest
import com.example.daegu.domain.sport.service.SportService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/sport")
class SportController(
    val sportService: SportService
) {
    @GetMapping
    fun findAll() : MutableList<SportEntity> {
        return sportService.findAll()
    }

    @PostMapping("/score")
    fun sportScoreRecord(@RequestBody request: ScorePredictionRequest) {
        return sportService.scorePrediction(request)
    }

}