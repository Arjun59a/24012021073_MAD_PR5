package com.example.myapplication

import android.R.attr.onClick
import android.content.Context
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun RegisterUi(context: Context, navController: NavHostController)
{
    var username by remember { mutableStateOf("") }
    var phoneno by remember { mutableStateOf("") }
    var city by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var conpassword by remember { mutableStateOf("") }
    Column (modifier = Modifier
        .fillMaxSize()
        .padding(10.dp))
    {

        Spacer(modifier = Modifier.height(20.dp))

        Image(
            painter = painterResource(R.drawable.logo),
            contentDescription = "Logo",
            modifier = Modifier
                .height(130.dp)
                .align(Alignment.CenterHorizontally),
            contentScale = ContentScale.Fit
        )
        Card(
            elevation = CardDefaults.cardElevation(defaultElevation = 20.dp),
            shape = MaterialTheme.shapes.medium,
            modifier = Modifier.fillMaxWidth()
        ) {
            Spacer(modifier = Modifier.height(20.dp))
            FormFeild("Name", username, { username = it }, false, false)
            FormFeild("Phone Number", phoneno, { phoneno = it }, false, true)
            FormFeild("City", city, { city = it }, false, false)
            FormFeild("Email", email, { email = it }, false, false)
            FormFeild("Password", password, { password = it }, true)
            FormFeild("Confirm Password", conpassword, { conpassword = it }, true)


            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = {
                    Log.i("Registration Activity", "This is Registration Activity")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text("Register", fontSize = 18.sp)
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row(modifier = Modifier.align(Alignment.CenterHorizontally)) {
            Text("Do you have an Account ?", fontSize = 18.sp)
            Spacer(modifier = Modifier.width(5.dp))
            TextButton(onClick = {
                navController.navigate("Login") {
                    popUpTo("SignUp") {
                        inclusive = true
                    }
                }
            }) {
                Text("Login", fontSize = 18.sp, color = Color.Red)
            }

        }
        }
    }

