package com.example.braindraft.fragments

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.braindraft.databinding.FragmentPromptInputBinding
import com.example.braindraft.viewModels.GptViewModel

class PromptInputFragment : Fragment() {
    private lateinit var binding: FragmentPromptInputBinding
    private lateinit var viewModel: GptViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPromptInputBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this)[GptViewModel::class.java]
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

        binding.btnGenerateContent.setOnClickListener {
            val prompt = binding.prompt.editableText.toString()
            viewModel.getContent(prompt, true)
            binding.progressBar.visibility = View.VISIBLE
        }

        viewModel.gptResponse.observe(viewLifecycleOwner) {
            binding.contentText.text = it
            binding.contentEdit.setText(it)
            binding.progressBar.visibility = View.GONE
        }

        binding.btnEdit.setOnClickListener {
            binding.contentText.visibility = View.GONE
            binding.contentEdit.visibility = View.VISIBLE
            binding.btnShare.isEnabled = false
            binding.btnEdit.isEnabled = false
        }

        binding.btnSave.setOnClickListener {
            Log.d("testing", "clicked")
            val textToSave = binding.contentEdit.editableText.toString()
            binding.contentText.text = textToSave
            binding.contentText.visibility = View.VISIBLE
            binding.contentEdit.visibility = View.GONE
            binding.btnShare.isEnabled = true
            binding.btnEdit.isEnabled = true
        }

        binding.btnShare.setOnClickListener {
            val textToShare = binding.contentText.text.toString()
            Log.d("testing", "content -> $textToShare")
            shareContent(textToShare)
        }
    }

    @SuppressLint("QueryPermissionsNeeded")
    fun shareContent(content: String) {
        val intent = Intent(Intent.ACTION_SEND).apply {
            type = "text/plain"
            putExtra(Intent.EXTRA_TEXT, content)
        }
        if (intent.resolveActivity(requireActivity().packageManager) != null) {
            startActivity(intent)
        }
    }
}