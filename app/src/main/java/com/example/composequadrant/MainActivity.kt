package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

// Creates main screen
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    FourQuadrants(modifier = Modifier.padding(it))
                }
            }
        }
    }
}

// Creates all four squares
@Composable
fun FourQuadrants(modifier: Modifier = Modifier) {
    Column {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.weight(1f)
        ) {
                Square(
                    stringResource(R.string.string_1),
                    stringResource(R.string.string_2),
                    colorResource(R.color.color_1),
                    Modifier.weight(1f))
                Square(
                    stringResource(R.string.string_3),
                    stringResource(R.string.string_4),
                    colorResource(R.color.color_2),
                    Modifier.weight(1f))
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.weight(1f)
        ) {
                Square(
                    stringResource(R.string.string_5),
                    stringResource(R.string.string_6),
                    colorResource(R.color.color_3),
                    Modifier.weight(1f))
                Square(
                    stringResource(R.string.string_7),
                    stringResource(R.string.string_8),
                    colorResource(R.color.color_4),
                    Modifier.weight(1f))
        }
    }
}

// Creates each individual square
@Composable
fun Square(
    title: String,
    description: String,
    color: androidx.compose.ui.graphics.Color,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxSize()
            .background(color)
            .padding(16.dp)
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = description,
            fontSize = 16.sp,
            textAlign = TextAlign.Justify
        )
    }
}


// Previews
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun QuadrantPreview() {
    ComposeQuadrantTheme {
        FourQuadrants()
    }
}