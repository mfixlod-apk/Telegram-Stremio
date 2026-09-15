package com.mfix.telered

/**
 * Source abstraction for Telegram dialogs.
 * The production implementation will enumerate the authenticated user's
 * dialogs and expose only groups/supergroups/channels.
 */
interface TelegramSourceRepository {
    suspend fun syncJoinedSources(): List<TelegramDialog>
}
