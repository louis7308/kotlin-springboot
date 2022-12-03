package com.example.daegu.domain.sport.presentation.dto.response

import java.time.LocalDateTime

class SportListResponse(
    var idx: Int,
    var name: String,
    var startAt: LocalDateTime
) {
}