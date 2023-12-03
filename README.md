# BrainDraft - Your Content Magnetizer

![braindraft](https://github.com/Bhavye2003Developer/BrainDraft/assets/110657263/661b4250-fba0-46f3-b4ce-b9f9d84202a2)

## Overview

BrainDraft is an Android app designed to effortlessly generate high-quality content for social media. Harnessing the power of OpenAI's fine-tuned GPT-3.5 model, BrainDraft simplifies content creation by allowing users to input a topic, prompting the model to generate captivating content that will magnetize your audience.

## Getting Started

1. **Open the project in Android Studio.**

2. **Obtain an API key from [OpenAI](https://beta.openai.com/signup/)** and replace `YOUR_API_KEY` in `GptApiService.kt` with your key.

3. **Build and run the app on your Android device or emulator.**

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

For any inquiries, please contact [your-email@example.com](mailto:your-email@example.com). Connect with us on [Twitter](https://twitter.com/YourTwitterHandle) and [Instagram](https://www.instagram.com/YourInstagramHandle/).

Thank you for choosing BrainDraft! Happy content creation!
