package com.angoga.kfd_workshop_server.database.repository

import com.angoga.kfd_workshop_server.database.entity.User
import jakarta.transaction.Transactional
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import java.time.LocalDateTime
import java.util.Optional

@Repository
interface UserDao : AppRepository<User> {
    fun findByEmail(email: String): Optional<User>

    fun existsByEmail(email: String): Boolean
}