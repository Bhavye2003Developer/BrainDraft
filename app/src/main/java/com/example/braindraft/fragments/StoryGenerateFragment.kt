package com.example.braindraft.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.braindraft.databinding.FragmentStoryGenerateBinding
import com.example.braindraft.viewModels.GptViewModel

class StoryGenerateFragment : Fragment() {

    private lateinit var binding: FragmentStoryGenerateBinding
    private lateinit var viewModel: GptViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentStoryGenerateBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this)[GptViewModel::class.java]
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnGenerateContent.setOnClickListener {
            val topic = binding.prompt.editableText.toString()
            viewModel.getContent(topic, false)
            binding.progressBar.visibility = View.VISIBLE
        }

        viewModel.gptResponse.observe(viewLifecycleOwner) {
            binding.story.text = it
            binding.progressBar.visibility = View.GONE
        }
    }

}