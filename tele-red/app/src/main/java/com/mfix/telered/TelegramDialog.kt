package com.mfix.telered

data class TelegramDialog(
    val id: Long,
    val title: String,
    val type: Type,
    var enabled: Boolean = true
) {
    enum class Type { GROUP, SUPERGROUP, CHANNEL }
}
