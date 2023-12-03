package com.example.braindraft.network.gpt

import android.util.Log
import com.example.braindraft.Prompt
import com.example.braindraft.gptResponse.GptResponse
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST
import java.util.concurrent.TimeUnit


const val OPENAI_API_KEY = "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"
const val BASE_URL = "https://api.openai.com/"


interface GptService {
    @Headers("Content-Type: application/json", "Authorization: Bearer $OPENAI_API_KEY")
    @POST("v1/chat/completions")
    fun getContent(@Body body: String): Call<GptResponse>
}

var client: OkHttpClient = OkHttpClient.Builder()
    .connectTimeout(6000, TimeUnit.SECONDS)
    .readTimeout(15000, TimeUnit.SECONDS).build()


var retrofit: Retrofit = Retrofit.Builder()
    .baseUrl(BASE_URL)
    .addConverterFactory(ScalarsConverterFactory.create())
    .addConverterFactory(GsonConverterFactory.create())
    .client(client)
    .build()

object GptApiService {
    private val service = retrofit.create(GptService::class.java)

    fun getStory(topic: String): Call<GptResponse> {
        val gptPrompt = Prompt.getStoryPrompt(topic)
        val body = getBody(gptPrompt)
        Log.d("testing", "body -> $body")
        return service.getContent(body)
    }

    fun getContent(prompt: String): Call<GptResponse> {
        val gptPrompt = Prompt.getContentPrompt(prompt)
        val body = getBody(gptPrompt)
        Log.d("testing", "body -> $body")
        return service.getContent(body)
    }

    private fun getBody(userInput: String): String {
        return "{\"model\": \"gpt-3.5-turbo\",\"messages\": [{\"role\": \"system\",\"content\": \"${userInput}\" }]}"
    }
}