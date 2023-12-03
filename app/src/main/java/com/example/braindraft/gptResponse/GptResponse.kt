package com.example.braindraft.gptResponse

data class GptResponse(
    val choices: List<Choice>,
    val created: Int,
    val id: String,
    val model: String,
    val `object`: String,
    val system_fingerprint: Any,
    val usage: Usage
)