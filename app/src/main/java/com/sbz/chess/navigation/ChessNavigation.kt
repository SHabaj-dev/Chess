package com.sbz.chess.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.sbz.chess.ui.screens.HomeScreen
import com.sbz.chess.ui.screens.PlayWithCpuScreen

@Composable
fun ChessNavigation() {
    var currentScreen by remember {
        mutableStateOf(ChessScreen.Home)
    }

    when (currentScreen) {
        ChessScreen.Home -> {
            HomeScreen(
                onPlayAgainstCPU = {
                    currentScreen = ChessScreen.PlayWithCPU
                },
                onPlayAgainstPlayer = {
                    //Todo: Implement Play Against Player
                }
            )
        }

        ChessScreen.PlayWithCPU -> {
            PlayWithCpuScreen(
                onBack = {
                    currentScreen = ChessScreen.Home
                }
            )
        }

        ChessScreen.PlayWithPlayer -> {
            //Todo: yet to Implement
        }
    }
}