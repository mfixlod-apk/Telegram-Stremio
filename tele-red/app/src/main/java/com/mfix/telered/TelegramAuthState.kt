package com.mfix.telered

/** UI-safe Telegram authentication state. Session secrets are never stored here. */
sealed interface TelegramAuthState {
    data object SignedOut : TelegramAuthState
    data object WaitingForPhone : TelegramAuthState
    data object WaitingForCode : TelegramAuthState
    data object WaitingForPassword : TelegramAuthState
    data object SignedIn : TelegramAuthState
    data class Error(val message: String) : TelegramAuthState
}
