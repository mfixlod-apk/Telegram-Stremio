package com.mfix.telered

/**
 * In-memory source store for the first Telegram integration milestone.
 * Only dialogs returned by the authenticated account belong here.
 */
class JoinedSourcesStore {
    private var sources: List<TelegramDialog> = emptyList()

    fun replace(items: List<TelegramDialog>) {
        sources = items
            .filter { it.type != TelegramDialog.Type.CHANNEL || it.enabled }
            .distinctBy { it.id }
    }

    fun all(): List<TelegramDialog> = sources
    fun enabled(): List<TelegramDialog> = sources.filter(TelegramDialog::enabled)
}
