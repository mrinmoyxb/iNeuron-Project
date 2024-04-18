package com.example.myapplication.view.homeScreen.homeScreenFinal

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.R
import com.example.myapplication.view.homeScreen.components.CardHeading
import com.example.myapplication.view.homeScreen.components.CustomTextHeading
import com.example.myapplication.view.homeScreen.components.customTextInput

@Preview(showBackground = true)
@Composable
fun HomeScreen() {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.primary))
            .padding(10.dp)
    ) {
        item {
            CardHeading()
            Spacer(modifier = Modifier.height(20.dp))

            CustomTextHeading(
                heading = "Higher Secondary Certificate Percentage",
                fontSize = 16,
                color = Color.Black,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Left
            )
            Spacer(modifier = Modifier.height(10.dp))
            val hsc_p = customTextInput("Enter your hsc_p")
            Spacer(modifier = Modifier.height(12.dp))

            CustomTextHeading(
                heading = "Masters of Business Administration Percentage",
                fontSize = 16,
                color = Color.Black,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Left
            )
            Spacer(modifier = Modifier.height(10.dp))
            val mba_p = customTextInput("Enter your mba_p")
            Spacer(modifier = Modifier.height(12.dp))

            CustomTextHeading(
                heading = "Degree Percentage",
                fontSize = 16,
                color = Color.Black,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Left
            )
            Spacer(modifier = Modifier.height(10.dp))
            val degree_p = customTextInput("Enter your degree_p")
            Spacer(modifier = Modifier.height(12.dp))

        }
    }
}