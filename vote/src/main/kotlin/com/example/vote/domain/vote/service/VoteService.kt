package com.example.vote.domain.vote.service

import com.example.vote.domain.vote.dto.response.VoteListResponse

interface VoteService {
    fun findAll() : MutableList<VoteListResponse>

}