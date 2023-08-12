package com.example.navigationincompose.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.navigationincompose.AUTHENTICATION_ROUTE
import com.example.navigationincompose.Person
import com.example.navigationincompose.Screen


@Composable
fun HomeScreen(
    navHostController: NavHostController
){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(
            modifier = Modifier.clickable {
                val person = Person(firstName = "Hi!!!" , secondName = "From other side")
                //navHostController.navigate(route = Screen.Detail.passId(5)) to call for single value
                navHostController.currentBackStackEntry?.savedStateHandle?.set(
                    key= "person",
                    value = person
                )
                navHostController.navigate(route = Screen.Detail.passNameAndId(10, "IamStupid"))
            },
            text = "Home",
            color = MaterialTheme.colors.primary,
            fontSize = MaterialTheme.typography.h3.fontSize,
            fontWeight = FontWeight.Bold
        )
        Text(
            modifier = Modifier
                .padding(top=150.dp)
                .clickable {
                    //Navigate to other NavGraph
                    navHostController.navigate(AUTHENTICATION_ROUTE)
                },
            text = "Login/SignUp",
            fontSize = MaterialTheme.typography.h5.fontSize,
            fontWeight = FontWeight.Black
        )
    }
}
@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
    HomeScreen(navHostController = rememberNavController())
}