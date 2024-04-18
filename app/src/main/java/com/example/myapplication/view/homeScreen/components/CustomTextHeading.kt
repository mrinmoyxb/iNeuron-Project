package com.example.myapplication.view.homeScreen.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun CustomTextHeading(
    heading: String,
    fontSize: Int,
    color: Color,
    fontWeight: FontWeight,
    textAlign: TextAlign
) {
    Text(
        heading,
        fontSize = fontSize.sp,
        color = color,
        fontWeight = fontWeight,
        textAlign = textAlign
    )
}