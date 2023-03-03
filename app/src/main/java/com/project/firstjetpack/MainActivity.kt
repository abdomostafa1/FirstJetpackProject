package com.project.firstjetpack

import ProfileScreen
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.*
import com.project.firstjetpack.screens.HomeScreen
import com.project.firstjetpack.screens.SecondScreen
import com.project.firstjetpack.ui.theme.FirstJetpackProjectTheme
import com.project.firstjetpack.viewmodel.ProfileViewModel
import com.project.firstjetpack.viewmodel.SecondViewModel

private const val TAG = "MainActivity"

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstJetpackProjectTheme {
                Scaffold {
                    HomeScreen()
                }

            }
        }
    }
}


//
//topBar = {
//    SmallTopAppBar(title = { Text("JetpackCompose", color = Color.Gray) },
//        navigationIcon = {
//            IconButton(onClick = {}) {
//                Icon(Icons.Filled.ArrowBack, "backIcon")
//            }
//        })
//},