package com.example.braindraft

object Prompt {


    fun getContentPrompt(prompt: String): String {
        return "Conduct a comprehensive analysis of the current landscape, challenges," +
                " and future prospects within the industry. Explore key trends, technological advancements, " +
                "and evolving consumer behaviors shaping the industry. " +
                "Evaluate the impact of external factors such as global events or regulatory changes." +
                " Provide strategic insights and recommendations for stakeholders" +
                " to navigate the ever-changing dynamics of the '$prompt'"
    }
}