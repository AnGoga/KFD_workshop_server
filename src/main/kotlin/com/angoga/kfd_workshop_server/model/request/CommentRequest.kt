package com.angoga.kfd_workshop_server.model.request

import com.angoga.kfd_workshop_server.model.response.common.AbstractResponse
import java.time.LocalDateTime

class CommentRequest(
    id: Long,
    var content: String
): AbstractResponse(id)