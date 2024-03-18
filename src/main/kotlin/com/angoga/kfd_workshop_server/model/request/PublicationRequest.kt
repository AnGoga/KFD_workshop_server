package com.angoga.kfd_workshop_server.model.request

import com.angoga.kfd_workshop_server.model.response.common.AbstractCreatedAtResponse
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToOne
import jakarta.persistence.Table

class PublicationRequest(
    var title: String,
    var content: String
)