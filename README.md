# BrainDraft - Your Content Magnetizer

![braindraft](https://github.com/Bhavye2003Developer/BrainDraft/assets/110657263/661b4250-fba0-46f3-b4ce-b9f9d84202a2)

## Overview

BrainDraft is an Android app designed to effortlessly generate high-quality content for social media. Harnessing the power of OpenAI's fine-tuned GPT-3.5 model, BrainDraft simplifies content creation by allowing users to input a topic, prompting the model to generate captivating content that will magnetize your audience.

## Getting Started
# BrainDraft - Your Content Magnetizer

BrainDraft is an Android app designed to effortlessly generate high-quality content for social media using OpenAI's fine-tuned GPT-3.5 model. It simplifies content creation by allowing users to input a topic, prompting the model to generate captivating content that will magnetize your audience.

![BrainDraft Logo](https://github.com/Bhavye2003Developer/BrainDraft/assets/110657263/661b4250-fba0-46f3-b4ce-b9f9d84202a2)

## Getting Started

1. **Clone the project:**
   - Open a terminal or command prompt and run the following command to clone the project:

     ```bash
     git clone https://github.com/Bhavye2003Developer/BrainDraft.git
     ```

2. **Open the project in Android Studio:**
   - Launch Android Studio and open the cloned project by selecting the `build.gradle` file.

3. **Obtain an API key from [OpenAI](https://beta.openai.com/signup/):**
   - Sign up for an OpenAI account and obtain an API key.
   - Replace `YOUR_API_KEY` in `GptApiService.kt` with your actual API key.


   ```kotlin
   const val OPENAI_API_KEY = "YOUR_API_KEY"

4. **Build and run the app on your Android device or emulator.**

## Architecture

BrainDraft follows the MVVM (Model-View-ViewModel) architecture for a clean and modular codebase. The key components include:

- **ViewModel (GptViewModel)**: Manages the data and business logic, interacts with the repository, and provides data to the UI.

- **Network (GptApiService)**: Handles API requests to OpenAI's GPT-3.5-turbo model using Retrofit.

- **UI (PromptInputFragment)**: Fragment responsible for capturing user input, displaying generated content, and providing editing and sharing functionalities.

## Dependencies

- Retrofit: A type-safe HTTP client for Android and Java.
- Gson: A library for JSON serialization and deserialization.
- OkHttp: An HTTP client for making network requests.

## Usage

1. **Launch the app on your Android device or emulator.**

2. **Enter a prompt or topic in the provided input field.**

3. **Click the "Generate Content" button to trigger the content generation process.**

4. **Edit the generated content as needed.**

5. **Save your edits and share the content directly from the app.**

## Contributing

Feel free to contribute to the project by opening issues or submitting pull requests. Your feedback and contributions are highly appreciated!

## License

This project is licensed under the [MIT License](LICENSE).

---

**BrainDraft - Your Content Magnetizer**

For any inquiries, please contact [bhavyedevelopment2003@gmail.com](mailto:bhavyedevelopment2003@gmail.com)

Thank you for choosing BrainDraft! Happy content creation!
