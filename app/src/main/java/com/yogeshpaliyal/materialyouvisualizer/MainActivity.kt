package com.yogeshpaliyal.materialyouvisualizer

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yogeshpaliyal.materialyouvisualizer.ui.theme.MaterialYouVisualizerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialYouVisualizerTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colorScheme.background) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                        PaletteViewer()
                    } else {
                        Box(modifier = Modifier.fillMaxSize()) {
                            Text(
                                text = "Works only on Android 12 and above",
                                textAlign = TextAlign.Center,
                                modifier = Modifier.align(alignment = Alignment.Center)
                            )
                        }
                    }
                }
            }
        }
    }
}


@Composable
fun PaletteViewer() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(ScrollState(0))
    ) {

        Text(
            text = "Wallpaper Colors Palette",
            style = TextStyle(fontSize = 20.sp),
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .padding(16.dp)
        )

        Row(modifier = Modifier.fillMaxWidth()) {
            ColorBox(
                name = "Primary",
                modifier = Modifier.weight(1f),
                color = MaterialTheme.colorScheme.primary,
                textColor = MaterialTheme.colorScheme.onPrimary
            )

            ColorBox(
                name = "Primary Container",
                modifier = Modifier.weight(1f),
                color = MaterialTheme.colorScheme.primaryContainer,
                textColor = MaterialTheme.colorScheme.onPrimaryContainer
            )
        }

        Row(modifier = Modifier.fillMaxWidth()) {

            ColorBox(
                name = "Secondary",
                modifier = Modifier.weight(1f),
                color = MaterialTheme.colorScheme.secondary,
                textColor = MaterialTheme.colorScheme.onSecondary
            )


            ColorBox(
                name = "Secondary Container",
                modifier = Modifier.weight(1f),
                color = MaterialTheme.colorScheme.secondaryContainer,
                textColor = MaterialTheme.colorScheme.onSecondaryContainer
            )
        }


        Row(modifier = Modifier.fillMaxWidth()) {
            ColorBox(
                name = "Tertiary",
                modifier = Modifier.weight(1f),
                color = MaterialTheme.colorScheme.tertiary,
                textColor = MaterialTheme.colorScheme.onTertiary
            )

            ColorBox(
                name = "Tertiary Container",
                modifier = Modifier.weight(1f),
                color = MaterialTheme.colorScheme.tertiaryContainer,
                textColor = MaterialTheme.colorScheme.onTertiaryContainer
            )
        }


        Row(modifier = Modifier.fillMaxWidth()) {

            ColorBox(
                name = "Error",
                modifier = Modifier.weight(1f),
                color = MaterialTheme.colorScheme.error,
                textColor = MaterialTheme.colorScheme.onError
            )


            ColorBox(
                name = "Error Container",
                modifier = Modifier.weight(1f),
                color = MaterialTheme.colorScheme.errorContainer,
                textColor = MaterialTheme.colorScheme.onErrorContainer
            )
        }


        Row(modifier = Modifier.fillMaxWidth()) {

            ColorBox(
                name = "Background",
                modifier = Modifier.weight(1f),
                color = MaterialTheme.colorScheme.background,
                textColor = MaterialTheme.colorScheme.onBackground
            )

            ColorBox(
                name = "Surface",
                modifier = Modifier.weight(1f),
                color = MaterialTheme.colorScheme.surface,
                textColor = MaterialTheme.colorScheme.onSurface
            )
        }

        Row(modifier = Modifier.fillMaxWidth()) {


            ColorBox(
                name = "Surface Variant",
                modifier = Modifier.weight(1f),
                color = MaterialTheme.colorScheme.surfaceVariant,
                textColor = MaterialTheme.colorScheme.onSurfaceVariant
            )

            ColorBox(
                name = "Outline",
                modifier = Modifier.weight(1f),
                color = MaterialTheme.colorScheme.outline,
                textColor = MaterialTheme.colorScheme.surface
            )
        }
    }
}


@Composable
fun ColorBox(name: String, modifier: Modifier, color: Color, textColor: Color) {
    Box(
        modifier = modifier
            .background(color)
            .height(100.dp)
    ) {
        Text(name, modifier = Modifier.padding(8.dp), textColor)
    }
}