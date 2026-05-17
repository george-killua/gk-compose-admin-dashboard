package dev.gkcoding.admindemo.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkScheme = darkColorScheme(
    primary = Color(0xFFD4A95A),
    onPrimary = Color(0xFF10131A),
    background = Color(0xFF090D16),
    surface = Color(0xFF101827),
    onBackground = Color(0xFFF5F7FB),
    onSurface = Color(0xFFF5F7FB),
    surfaceVariant = Color(0xFF172033),
    onSurfaceVariant = Color(0xFFADB8CB),
)

@Composable
fun GKBookingTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = DarkScheme,
        content = content,
    )
}
