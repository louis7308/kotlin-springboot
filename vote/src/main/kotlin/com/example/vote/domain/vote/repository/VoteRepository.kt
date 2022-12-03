package com.example.vote.domain.vote.repository

import com.example.vote.domain.vote.Vote
import org.springframework.data.jpa.repository.JpaRepository

interface VoteRepository : JpaRepository<Vote, Int> {

}