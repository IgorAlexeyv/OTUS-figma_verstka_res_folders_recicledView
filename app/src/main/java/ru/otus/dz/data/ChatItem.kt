package ru.otus.dz.data

import androidx.annotation.DrawableRes
import org.w3c.dom.Text
import ru.otus.dz.R
import java.sql.Time

data class ChatItem(
    val id: Int,
    @DrawableRes val avatar: Int,
    val name: String,
    val voip: Boolean = false,
    val locked:Boolean = false,
    val verified: Boolean = false,
    val mute: Boolean = false,
    val scam: Boolean = false,
    val middleText: String? = null,
    val typing: Boolean = false,
    val previewText: String? = null,
    @DrawableRes val previewImage: Int? = null,
    val checked: Boolean = false,
    val time: String = "12:00",
    val pinned: Boolean = false,
    val mentioned: Boolean = false,
    val count: Int = 0
)

val chat = listOf(
    ChatItem(
        id = 1,
        avatar = R.drawable.cat,
        name = "Dima Murantsev",
        voip = false,
        locked = false,
        verified = true,
        mute = false,
        scam = false,
        middleText = null,
        typing = false,
        previewText = "You are welcome!",
        previewImage = R.drawable.preview,
        checked = true,
        time = "11:38",
        pinned = true,
        mentioned = false,
        count = 0
    ),
    ChatItem(
        id = 2,
        avatar = R.drawable.cat,
        name = "SnejUgal News",
        voip = true,
        locked = false,
        verified = false,
        mute = true,
        scam = false,
        middleText = "Nikolay",
        typing = false,
        previewText = "F",
        previewImage = R.drawable.preview,
        checked = false,
        time = "11:38",
        pinned = true,
        mentioned = true,
        count = 0
    ),
    ChatItem(
        id = 3,
        avatar = R.drawable.cat,
        name = "Catbird",
        voip = false,
        locked = false,
        verified = false,
        mute = false,
        scam = false,
        middleText = null,
        typing = true,
        previewText = null,
        previewImage = null,
        checked = true,
        time = "11:38",
        pinned = true,
        mentioned = false,
        count = 0
    ),
    ChatItem(
        id = 4,
        avatar = R.drawable.cat,
        name = "R4IN80W",
        voip = false,
        locked = true,
        verified = false,
        mute = false,
        scam = true,
        middleText = null,
        typing = false,
        previewText = "du biest mein sonnechein",
        previewImage = R.drawable.preview,
        checked = false,
        time = "11:38",
        pinned = false,
        mentioned = false,
        count = 0
    ),
    ChatItem(
        id = 5,
        avatar = R.drawable.cat,
        name = "Yes. No",
        voip = false,
        locked = false,
        verified = true,
        mute = false,
        scam = false,
        middleText = "Anno",
        typing = false,
        previewText = "I see all :)",
        previewImage = null,
        checked = true,
        time = "11:38",
        pinned = false,
        mentioned = false,
        count = 50
    )
)