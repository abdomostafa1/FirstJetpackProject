package com.project.firstjetpack.screens

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.project.firstjetpack.R
import com.project.firstjetpack.composable.Icon
import com.project.firstjetpack.composable.SpacerHorizontal8
import com.project.firstjetpack.composable.SpacerVertical48
import com.project.firstjetpack.viewmodel.SecondViewModel


@Composable
fun SecondScreen(viewModel: SecondViewModel) {

    val counter by viewModel.counter.collectAsState()

    val onclickPlus:()->Unit=viewModel::increaseCounter
    val onclickMinus:()->Unit=viewModel::decreaseCounter
    Log.e("TAG", "SecondScreen: ", )
    SecondContent(counter.toString(),onclickPlus,onclickMinus)
}

@Composable
private fun SecondContent(counter:String,onclickPlus:()->Unit,onclickMinus:()->Unit){

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp, 16.dp)
        , verticalArrangement = Arrangement.SpaceEvenly
        , horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Text(text = counter, color = Color.Black, fontSize = 40.sp)

        Row {
            val btnModifier= Modifier.background(colorResource(id = R.color.purple_500))

            val btnColor=ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.purple_700))
            Button(onClick = onclickMinus, colors = btnColor) {
                Icon(painter = painterResource(id = R.drawable.minimize_24), color = Color.Transparent)
            }

            SpacerHorizontal8()

            Button(onClick =   onclickPlus ,colors=ButtonDefaults.buttonColors(containerColor = Color.Green)) {
                Icon(painter = painterResource(id = R.drawable.add_24),color=Color.Transparent)
            }
        }
    }
}