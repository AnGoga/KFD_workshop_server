package com.angoga.kfd_workshop_server.model.response

import com.angoga.kfd_workshop_server.model.response.common.AbstractResponse
import java.time.LocalDateTime

class CommentResponse(
    id: Long,
    var content: String
): AbstractResponse(id)