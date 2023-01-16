package com.example.bookshelf.data.response

@kotlinx.serialization.Serializable

data class PanelizationSummary(
    val containsEpubBubbles: Boolean,
    val containsImageBubbles: Boolean
)