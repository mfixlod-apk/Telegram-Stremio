package com.mfix.telered

/** Converts Telegram dialog metadata into the app's restricted source model. */
object TelegramSourceMapper {
    fun map(id: Long, title: String, kind: String): TelegramDialog? {
        val type = when (kind.lowercase()) {
            "group" -> TelegramDialog.Type.GROUP
            "supergroup" -> TelegramDialog.Type.SUPERGROUP
            "channel" -> TelegramDialog.Type.CHANNEL
            else -> return null
        }
        return TelegramDialog(id = id, title = title, type = type)
    }
}
