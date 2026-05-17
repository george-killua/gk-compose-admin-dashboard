package dev.gkcoding.admindemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dev.gkcoding.admindemo.ui.AdminDashboardApp
import dev.gkcoding.admindemo.ui.theme.GKBookingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GKBookingTheme {
                AdminDashboardApp()
            }
        }
    }
}
