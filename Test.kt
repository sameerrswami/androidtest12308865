package com.example.testapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testapp.ui.theme.TestAppTheme

class Test : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TestAppTheme {
                show()
            }
        }
    }
}

@Composable
fun show(){
    var category by remember { mutableStateOf("") }
    var date by remember { mutableStateOf("") }
    val context = LocalContext.current
    Column(modifier = Modifier.fillMaxSize()){
        Text(modifier = Modifier
            .fillMaxWidth()
            .height(40.dp)
            .background(Color.Black)
            .padding(6.dp), text = "Event Manager", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color.White)
        Text(modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp), text = "Tech Fest", fontSize = 22.sp)
        Text(modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp), text = "Sameer Swami", fontSize = 18.sp)
        Text(modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp), text = "12308865", fontSize = 18.sp)
        TextField(value = category, onValueChange = { category = it }, label = { Text("Category")}, modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 18.dp))
        TextField(value = date, onValueChange = { date = it }, label = { Text("dd-mm-yyyy")}, modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 18.dp, vertical = 10.dp))
        Button(onClick = {Toast.makeText(context, "Registered!", Toast.LENGTH_SHORT).show()}, modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 18.dp, vertical = 10.dp)) {Text(text = "Register")}
        }
    }

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TestAppTheme {
        show()
    }
}