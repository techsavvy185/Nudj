package com.tpc.nudj.ui.screens.clubDashboard

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun ClubDashboardScreen(
    onCreateEventClicked:()->Unit
){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Button(
            onClick = {
                onCreateEventClicked()
            }
        ) {
            Text(
                text = "Create Event",
            )
        }
    }
}