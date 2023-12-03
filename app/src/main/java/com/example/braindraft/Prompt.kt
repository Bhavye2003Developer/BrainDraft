package com.example.braindraft

object Prompt {


    fun getContentPrompt(prompt: String): String {
        return "Conduct a comprehensive analysis of the current landscape, challenges," +
                " and future prospects within the industry. Explore key trends, technological advancements, " +
                "and evolving consumer behaviors shaping the industry. " +
                "Evaluate the impact of external factors such as global events or regulatory changes." +
                " Provide strategic insights and recommendations for stakeholders" +
                " to navigate the ever-changing dynamics of the $prompt"
    }

    fun getStoryPrompt(topic: String): String {
        return "{\\\"instruction\\\":\\\"Generate a story in parts with detailed prompts for image generation. " +
                "TOPIC -> '${topic}' \\\",\\\"format\\\":\\\"JSON\\\",\\\"structure\\\":{\\\"story\\\":" +
                "[{\\\"part\\\":1,\\\"text\\\":\\\"Description of the story's beginning.\\\",\\\"prompt\\\":{\\\"description\\\":" +
                "\\\"Create an image that depicts the opening scene of the story. Title: The Beginning\\\"}},{\\\"part\\\":2," +
                "\\\"text\\\":\\\"Description of the story's development.\\\",\\\"prompt\\\":" +
                "{\\\"description\\\":\\\"Generate an image representing the progression of the story. Title: The Development\\\"}}" +
                ",{\\\"part\\\":3,\\\"text\\\":\\\"Description of the story's midpoint.\\\",\\\"prompt\\\":" +
                "{\\\"description\\\":\\\"Create an image capturing the turning point of the story. Title: The Midpoint\\\"}}," +
                "{\\\"part\\\":4,\\\"text\\\":\\\"Description of the story's challenges and conflicts.\\\",\\\"prompt\\\":" +
                "{\\\"description\\\":\\\"Generate an image that reflects the challenges faced in the story. " +
                "Title: The Challenges\\\"}},{\\\"part\\\":5,\\\"text\\\":\\\"Description of the story's " +
                "resolution and conclusion.\\\",\\\"prompt\\\":{\\\"description\\\":\\\"Create an image symbolizing the " +
                "resolution and conclusion of the story. Title: The Resolution\\\"}}],\\\"constraints\\\":\\\"" +
                "The JSON response should strictly adhere to the specified format, including numbered parts, descriptive text," +
                " and prompts. Only the 'TOPIC' field should be left blank for user input.\\\"}"
    }
}