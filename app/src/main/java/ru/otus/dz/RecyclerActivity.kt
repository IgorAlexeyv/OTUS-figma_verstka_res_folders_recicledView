package ru.otus.dz

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration.VERTICAL
import com.google.android.material.divider.MaterialDividerItemDecoration
import ru.otus.dz.data.chat
import ru.otus.dz.databinding.ActivityRecyclerBinding

class RecyclerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRecyclerBinding

    private val adapter = ChatAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.chatList.adapter = adapter
        adapter.submitList(chat)

        //item decoration
        val dividerItemDecoration = MaterialDividerItemDecoration(
            binding.chatList.context,
            VERTICAL
        ).apply {
            dividerInsetStart = resources.getDimensionPixelOffset(R.dimen.text_start)
        }
        binding.chatList.addItemDecoration(dividerItemDecoration)
    }
}