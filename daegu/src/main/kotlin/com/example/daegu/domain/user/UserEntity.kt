package com.example.daegu.domain.user

import com.example.daegu.domain.sport.SportEntity
import com.example.daegu.domain.user.enum.SportEnum
import javax.persistence.*

@Entity
class UserEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val idx: Int? = null,

    val name: String,

    val country: String,

    val score: Int,

    @Enumerated(EnumType.STRING)
    val sportType: SportEnum,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sport_idx")
    var sportEntity: SportEntity?
) {
}