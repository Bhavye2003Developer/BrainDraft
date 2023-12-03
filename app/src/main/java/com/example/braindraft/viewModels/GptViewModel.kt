package com.example.braindraft.viewModels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.braindraft.gptResponse.GptResponse
import com.example.braindraft.network.gpt.GptApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class GptViewModel : ViewModel() {
    private val _gptResponse: MutableLiveData<String> = MutableLiveData("")
    val gptResponse: LiveData<String>
        get() = _gptResponse

    fun getContent(prompt: String, isGenerateContent: Boolean) {
        Log.d("testing", "p -> $prompt")
        val service: Call<GptResponse> = if (isGenerateContent) {
            // content generation
            GptApiService.getContent(prompt)
        } else {
            // story generation
            GptApiService.getStory(prompt)
        }
        service.enqueue(object : Callback<GptResponse?> {
            override fun onResponse(
                call: Call<GptResponse?>,
                response: Response<GptResponse?>
            ) {
                val gptResponse = response.body()?.choices?.get(0)?.message?.content
                _gptResponse.postValue(gptResponse.toString())

                Log.d("testing", "resp -> $gptResponse")
            }

            override fun onFailure(call: Call<GptResponse?>, t: Throwable) {
                _gptResponse.postValue(t.toString())
                t.message?.let { Log.d("testing", "err -> $it") }
            }
        })
    }
}