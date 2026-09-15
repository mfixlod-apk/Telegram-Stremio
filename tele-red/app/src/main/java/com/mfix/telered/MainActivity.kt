package com.mfix.telered

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { TeleRedHome() }
    }
}

@Composable
private fun TeleRedHome() {
    Column(
        modifier = Modifier.fillMaxSize().background(Color(0xFF0B0B0B)).padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("TeleRed", color = Color(0xFFE50914), style = MaterialTheme.typography.headlineLarge)
        Text("Telegram → Stremio", color = Color.White, modifier = Modifier.padding(top = 8.dp))
        Text(
            "השלב הבא: התחברות ל-Telegram וסריקה אוטומטית של הקבוצות והערוצים שלך.",
            color = Color.LightGray,
            modifier = Modifier.padding(vertical = 24.dp)
        )
        Button(onClick = { /* Telegram authentication will be wired next */ }) {
            Text("התחברות ל-Telegram")
        }
    }
}
