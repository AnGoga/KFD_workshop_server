package com.angoga.kfd_workshop_server.model.response.user

import com.angoga.kfd_workshop_server.model.response.common.AbstractCreatedAtResponse
import java.time.LocalDate
import java.time.LocalDateTime

open class UserResponse(
    id: Long,
    createdAt: LocalDateTime,
    val email: String,
    val name: String,
): AbstractCreatedAtResponse(id, createdAt)