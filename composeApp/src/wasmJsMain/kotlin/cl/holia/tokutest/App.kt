package cl.holia.tokutest

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import kotlinx.browser.document
import org.jetbrains.compose.resources.painterResource

import tokutest.composeapp.generated.resources.Res

@Composable
fun App() {
    MaterialTheme {
        MainPage()
    }
}

@Composable
fun MainPage() {
    SetTitle("Toku Test")
}
