package com.example.daegu.domain.sport.service

import com.example.daegu.domain.sport.SportEntity
import com.example.daegu.domain.sport.presentation.dto.request.ScorePredictionRequest
import com.example.daegu.domain.sport.repository.SportRepository
import com.example.daegu.domain.user.UserEntity
import com.example.daegu.domain.user.enum.SportEnum
import com.example.daegu.domain.user.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class SportService(
    val sportRepository: SportRepository,
    val userRepository: UserRepository
) {
    fun findAll() : MutableList<SportEntity> {
        return sportRepository.findAll()
    }

    fun scorePrediction(request: ScorePredictionRequest) {
        val entity = sportRepository.findByName(request.country)
        val userEntity = UserEntity(
            name = request.name,
            country = request.country,
            score = request.score,
            sportEntity = entity,
            sportType = SportEnum.UNDEFINED
        )
        userRepository.save(userEntity)
    }

    fun getResult(name: String) {
        val userEntity: UserEntity = userRepository.findByName(name)
        
    }

}