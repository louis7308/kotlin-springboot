package com.example.vote.domain.vote.service.Impl

import com.example.vote.domain.vote.Vote
import com.example.vote.domain.vote.dto.response.VoteListResponse
import com.example.vote.domain.vote.repository.VoteRepository
import com.example.vote.domain.vote.service.VoteService
import org.springframework.stereotype.Service

@Service
class VoteServiceImpl(
    val voteRepository: VoteRepository
) : VoteService {
    override fun findAll(): MutableList<VoteListResponse> {
        var list: MutableList<VoteListResponse> = mutableListOf()
        voteRepository.findAll()
            .forEach{ v: Vote -> list.add(
                VoteListResponse(
                    title = v.title,
                    createdAt = v.createdBy,
                    personnel = v.voteCount.size,
                    agree = v.agree,
                    reject = v.reject
                )
            )}
        return list;
    }
}