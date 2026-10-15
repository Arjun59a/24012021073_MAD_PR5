package com.example.myapplication

import android.graphics.Color.red
import androidx.compose.foundation.background
import androidx.compose.foundation.focusable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.overscroll
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun checkbox ()
{

    var redstate by remember { mutableStateOf(true) }
    var bluestate by remember { mutableStateOf(true) }
    var greenstate by remember { mutableStateOf(true) }
    Column() {


        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(
                checked = redstate ,
                onCheckedChange = {
                    redstate = it
                    if (redstate == true)
                    {

                    }
                },

                )

            Text(
                "Red"
            )
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(
                checked = bluestate,
                onCheckedChange = {
                    bluestate = it
                }
            )
            Text(
                "Blue"
            )

        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(
                checked = greenstate ,
                onCheckedChange = {
                    greenstate = it
                }
            )

            Text(
                "Green"
            )

        }


        Box(modifier = Modifier.fillMaxSize().padding(top= 16.dp),
            Alignment.Center)
        {
            if (redstate) {
                Box(
                    modifier = Modifier.fillMaxSize()
                        .padding(64.dp).background(Color.Red)
                )

            }
            if(bluestate)
            {
                Box(
                    modifier = Modifier
                        .size(150.dp)
                        .background(Color.Blue)
                )
            }
            if (greenstate)
            {
                Box(
                    modifier = Modifier.size(100.dp).background(Color.Green)
                ) { }
            }
        }

    }





}

