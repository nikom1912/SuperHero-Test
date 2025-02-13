package cl.holia.tokutest

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import kotlinx.browser.document

@Composable
fun SetTitle(title: String) {
    LaunchedEffect(title) {
        document.title = title
    }
}