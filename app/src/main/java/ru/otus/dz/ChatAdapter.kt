package ru.otus.dz

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import ru.otus.dz.data.ChatItem
import ru.otus.dz.databinding.VhChatBinding

class ChatAdapter : ListAdapter<ChatItem, ChatAdapter.ChatViewHolder>(ChatDiff) {
    class ChatViewHolder(private val binding: VhChatBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(chatItem: ChatItem) = with(binding){
            Glide.with(binding.root).load(chatItem.avatar).circleCrop().into(avatar)
            iconVoip.visibility = if (chatItem.voip) {
                View.VISIBLE
            } else {
                View.GONE
            }

            iconLock.visibility = if (chatItem.locked) {
                View.VISIBLE
            } else {
                View.GONE
            }

            name.text = chatItem.name

            verified.visibility = if (chatItem.verified) {
                View.VISIBLE
            } else {
                View.GONE
            }

            mute.visibility = if (chatItem.mute) {
                View.VISIBLE
            } else {
                View.GONE
            }

            scam.visibility = if (chatItem.scam) {
                View.VISIBLE
            } else {
                View.GONE
            }

            middleText.text = chatItem.middleText
            middleText.visibility = if (null != chatItem.middleText) {
                View.VISIBLE
            } else {
                View.GONE
            }

            typingIcon.visibility = if (chatItem.typing) {
                View.VISIBLE
            } else {
                View.GONE
            }
            typing.visibility = if (chatItem.typing) {
                View.VISIBLE
            } else {
                View.GONE
            }

            if (null != chatItem.previewImage) {
                preview.setImageResource(chatItem.previewImage)
                preview.visibility = View.VISIBLE
            } else {
                preview.visibility = View.GONE
            }

            if (null != chatItem.previewText) {
                previewText.text = chatItem.previewText
                previewText.visibility = View.VISIBLE
            } else {
                previewText.visibility = View.GONE
            }

            if (chatItem.checked) {
                checkIcon.visibility = View.VISIBLE
            } else {
                checkIcon.visibility = View.GONE
            }

            time.text = chatItem.time

            pinned.visibility = if (chatItem.pinned) {
                View.VISIBLE
            } else {
                View.GONE
            }
            pinnedSpace.visibility = if (chatItem.pinned) {
                View.VISIBLE
            } else {
                View.GONE
            }

            mentioned.visibility = if (chatItem.mentioned) {
                View.VISIBLE
            } else {
                View.GONE
            }
            mentionedSpace.visibility = if (chatItem.mentioned) {
                View.VISIBLE
            } else {
                View.GONE
            }

            if (0 != chatItem.count) {
                count.text = chatItem.count.toString()
                count.visibility = View.VISIBLE
            } else {
                count.visibility = View.GONE
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        return ChatViewHolder(VhChatBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

private object ChatDiff : DiffUtil.ItemCallback<ChatItem>() {
    override fun areItemsTheSame(oldItem: ChatItem, newItem: ChatItem): Boolean = oldItem.id == newItem.id
    override fun areContentsTheSame(oldItem: ChatItem, newItem: ChatItem): Boolean = oldItem == newItem
}