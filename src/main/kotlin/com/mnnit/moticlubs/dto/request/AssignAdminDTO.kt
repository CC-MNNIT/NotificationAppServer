package com.mnnit.moticlubs.dto.request

import com.fasterxml.jackson.annotation.JsonProperty

data class AssignAdminDTO(
    @JsonProperty("cid")
    val cid: Long,

    @JsonProperty("regNo")
    val regNo: String,
)
