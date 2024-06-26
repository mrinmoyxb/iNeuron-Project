package com.example.myapplication.view.homeScreen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R

@Preview(showBackground = true)
@Composable
fun CardHeading() {
    Card(
        modifier = Modifier
            .height(170.dp)
            .fillMaxWidth()
            .background(Color.Transparent),
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(colorResource(id = R.color.secondary)),
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
        ) {
            Row(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier.fillMaxWidth(0.7f),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start
                ) {

                    // Heading
                    Text(
                        "Campus Placement Prediction", fontSize = 25.sp,
                        color = colorResource(id = R.color.primary),
                        fontWeight = FontWeight.SemiBold,
                        textAlign = TextAlign.Left
                    )
                    Spacer(modifier = Modifier.height(10.dp))

                    // Sub description
                    Text(
                        "A machine learning model that can predict campus placement with 98% accuracy",
                        fontSize = 17.sp,
                        color = colorResource(id = R.color.primary),
                        fontWeight = FontWeight.Medium,
                        textAlign = TextAlign.Left
                    )
                }
            }
        }
    }
}