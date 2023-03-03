package com.project.firstjetpack.composable

import android.graphics.drawable.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.project.firstjetpack.R
import com.project.firstjetpack.ui.theme.Rubik


@Composable
fun Icon(painter: Painter,color: Color) {
    Box(modifier = Modifier
        .size(45.dp)
        .drawBehind {
            drawCircle(color = color)
        }
        , contentAlignment = Alignment.Center
    ) {
        Icon(painter = painter, contentDescription = null, tint =Color.Unspecified)
    }
}
