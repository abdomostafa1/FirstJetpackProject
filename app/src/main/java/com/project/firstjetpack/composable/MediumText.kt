package com.project.firstjetpack.composable

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.project.firstjetpack.ui.theme.Rubik


@Composable
fun MediumText(text: String,color:Color=Color.Black,fontSize:TextUnit,modifier: Modifier=Modifier) {
    Text(
        text = text, fontFamily = Rubik,
        fontWeight = FontWeight.Normal,
        fontSize = fontSize,
        color = color,
        modifier=modifier
    )
}