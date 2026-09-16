package com.mfix.telered

/**
 * Telegram source discovery boundary.
 *
 * The implementation is intentionally isolated from the UI so the Telegram
 * client can be wired in without changing the rest of the app. It must only
 * return dialogs available to the authenticated Telegram account; it must not
 * use Telegram global search to discover sources.
 */
class TelegramSourceRepositoryImpl : TelegramSourceRepository {
    override suspend fun syncJoinedSources(): List<TelegramDialog> {
        // Telegram client wiring is the next layer. Keeping this boundary here
        // lets the UI and source-selection logic be tested independently.
        return emptyList()
    }
}
