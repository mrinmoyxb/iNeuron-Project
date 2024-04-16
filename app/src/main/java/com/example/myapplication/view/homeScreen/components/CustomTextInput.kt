package com.example.myapplication.view.homeScreen.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun CustomTextInput() {
    var value by remember { mutableStateOf("") }
    TextField(
        value = value, onValueChange = { value = it },
        placeholder = { Text("Enter age") },
        modifier = Modifier.fillMaxWidth()
    )
}