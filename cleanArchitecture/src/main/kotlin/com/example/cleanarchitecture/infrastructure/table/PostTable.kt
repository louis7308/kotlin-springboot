package com.example.cleanarchitecture.infrastructure.table

import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class PostTable(
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   val id: Long? = 0,

   @Column(name = "title", length = 60)
   val title: String,

   @Column(name = "content", length = 500)
   val content: String,

   @Column(name = "created_at")
   val createdAt: LocalDateTime,

   @Column(name = "view")
   val view: Int,

   @Column(name = "is_deleted", columnDefinition = "tinyint")
   val isDeleted: Boolean,

   @Column(name = "is_public", columnDefinition = "tinyint")
   val isPublic: Boolean
)