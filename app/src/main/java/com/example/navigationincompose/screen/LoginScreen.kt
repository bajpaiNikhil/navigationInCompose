package com.example.navigationincompose.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.navigationincompose.HOME_ROUTE
import com.example.navigationincompose.Screen

@Composable
fun LoginScreen(
    navHostController: NavHostController
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.clickable {
                navHostController.navigate(route = Screen.SignUp.route)
            },
            text = "Login",
            fontSize = MaterialTheme.typography.h3.fontSize,
            color = Color.Magenta,
            fontWeight = FontWeight.ExtraBold
        )
        Text(
            modifier = Modifier
                .padding(150.dp)
                .clickable {
                    //going back to other navigation graph
                    navHostController.navigate(HOME_ROUTE) {
                        popUpTo(HOME_ROUTE)
                    }
                },
            text = "Go back",
            fontSize = MaterialTheme.typography.h5.fontSize,
            fontWeight = FontWeight.Medium,
            color = Color.Black
            )
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen(navHostController = rememberNavController())
}