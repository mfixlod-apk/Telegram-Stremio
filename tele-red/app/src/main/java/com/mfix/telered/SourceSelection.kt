package com.mfix.telered

/** Search scope for TeleRed. Never falls back to Telegram global search. */
data class SourceSelection(
    val sources: List<TelegramDialog> = emptyList()
) {
    fun enabledSources(): List<TelegramDialog> = sources.filter { it.enabled }

    fun contains(id: Long): Boolean = sources.any { it.id == id }
}
