package com.example.crud.domain.post.repository

import com.example.crud.domain.post.Post
import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository : JpaRepository<Post, Long> {
}