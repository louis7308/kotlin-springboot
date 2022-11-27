package com.example.cleanarchitecture.core.entities

import java.time.LocalDateTime

class CommonPost(
    val title: String,
    val content: String,
    val createdAt: LocalDateTime,
    var view: Int,
    var isDeleted: Boolean, // default : fasle 삭제 안된 상태 |  default : true 삭제 된 상태
    var isPublic: Boolean // default : true 공개된 상태 | default : false 공개안된 상태
): Post {
    override fun canShow(): Boolean { // 게시글 공개 상태 표시
        return !isDeleted && isPublic
    }

    override fun delete() { // 게시글 삭제
        this.isDeleted = true
    }

    override fun increaseView() { // 게시글 조회수 증가
        this.view += 1
    }
}