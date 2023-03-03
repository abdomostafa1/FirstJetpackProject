package com.project.firstjetpack.composable

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.FloatingActionButtonElevation
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp


@Composable
fun FloatActionButton(painter: Painter, containerColor: Color, elevation: Int = 0) {
    FloatingActionButton(
        onClick = {}, containerColor = containerColor,
        elevation = FloatingActionButtonDefaults.elevation(elevation.dp)
    ) {
        Icon(painter = painter, contentDescription = null)
    }
}
