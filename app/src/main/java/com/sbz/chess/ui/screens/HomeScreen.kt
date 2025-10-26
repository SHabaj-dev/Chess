package com.sbz.chess.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sbz.chess.ui.widgets.GameOptionButton
import com.sbz.chess.ui.widgets.TitleText

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    onPlayAgainstPlayer: () -> Unit = {},
    onPlayAgainstCPU: () -> Unit = {}
) {

    Surface(
        modifier = modifier,
        color = Color.White
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            TitleText("♖ Chess")
            TitleText(
                "Please Select Your Play Mode",
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(4.dp)
            )

            Spacer(modifier = Modifier.height(8.dp))

            GameOptionButton(
                "Single Player",
                "Play with friends and family.",
                onPlayAgainstPlayer
            )

            Spacer(modifier = Modifier.height(8.dp))

            GameOptionButton(
                "CPU",
                "Play with Computer.",
                onPlayAgainstCPU
            )

        }
    }

}

@Composable
@Preview(showSystemUi = true)
fun HomePreview() {
    HomeScreen()
}