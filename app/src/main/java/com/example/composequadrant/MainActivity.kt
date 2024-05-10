package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    FourQuadrants(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun FourQuadrants(modifier: Modifier = Modifier) {
    Column (
        modifier = modifier.fillMaxSize(),
    ) {
        Row {
            // First Quadrant
            Square(stringResource(R.string.string_1), stringResource(R.string.string_2))

            // Second Quadrant
            Square(stringResource(R.string.string_3), stringResource(R.string.string_4))

        }
        Row {
            // Third Quadrant
            Square(stringResource(R.string.string_5), stringResource(R.string.string_6))
            // Fourth Quadrant
            Square(stringResource(R.string.string_7), stringResource(R.string.string_8))
        }
    }
}

@Composable
fun Square(title: String, description: String, modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    )
    {
        Text(
            text = title
        )
        Text(
            text = description
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        FourQuadrants()
    }
}