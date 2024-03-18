package com.angoga.kfd_workshop_server.database.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table


@Entity
@Table(name = "`User`")
class User(
    @Column(name = "email", nullable = false, unique = true)
    var email: String,

    @Column(name = "name", nullable = false)
    var name: String,

) : AbstractCreatedAtEntity() {
    @Column(name = "hash", nullable = false)
    var hash: String? = null
}