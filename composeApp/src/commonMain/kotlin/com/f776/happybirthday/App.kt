package com.f776.happybirthday

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import happybirthday.composeapp.generated.resources.Res
import happybirthday.composeapp.generated.resources.androidparty
import happybirthday.composeapp.generated.resources.happy_birthday_text
import happybirthday.composeapp.generated.resources.signature_text
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
@Preview
fun App() {
    MaterialTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            GreetingImage(
                message = stringResource(Res.string.happy_birthday_text),
                from = stringResource(Res.string.signature_text),
            )
        }
    }
}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = message,
            fontSize = 90.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center,
            color = MaterialTheme.colors.primary
        )
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = Modifier.padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally),
            color = MaterialTheme.colors.secondaryVariant
        )
    }
}

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(Res.drawable.androidparty)
    Box(modifier = modifier) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5f
        )

        GreetingText(
            message = message,
            from = from,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
}