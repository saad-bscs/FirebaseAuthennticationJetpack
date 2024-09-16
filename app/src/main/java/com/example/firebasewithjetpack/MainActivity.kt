package com.example.firebasewithjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.firebasewithjetpack.ui.viewModel.AuthViewModel
import com.example.firebasewithjetpack.ui.utils.MyAppNavigation
import com.example.firebasewithjetpack.ui.theme.FireBaseWithJetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val authViewModel: AuthViewModel by viewModels()
        setContent {
            FireBaseWithJetpackTheme {
                // A surface container using the 'background' color from the theme
                Scaffold(modifier = Modifier.fillMaxWidth()) {
                    MyAppNavigation(modifier = Modifier.padding(it), authViewModel = authViewModel)

                }
            }
        }
    }
}
