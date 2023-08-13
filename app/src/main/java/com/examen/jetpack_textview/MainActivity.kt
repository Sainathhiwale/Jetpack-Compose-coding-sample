package com.examen.jetpack_textview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.examen.jetpack_textview.ui.theme.Jetpack_TextViewTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jetpack_TextViewTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                   simpleText("Jetpack Compose")
                }
            }
        }
    }


}
@Composable
private fun simpleText(name: String) {
 Text(text = "sample")
}

/*
@Composable
fun Greeting(name: String) {
    Text(text = "Sainath $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Jetpack_TextViewTheme {
        Greeting("Android")
    }
}*/
