package com.project.firstjetpack.composable

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun SpacerHorizontal16(modifier: Modifier=Modifier){
    Spacer(modifier = modifier.width(16.dp))
}