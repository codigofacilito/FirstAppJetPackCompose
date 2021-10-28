package com.codigofacilito.myfirsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.codigofacilito.myfirsapp.ui.theme.MyFirsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFirsAppTheme {
                HomeScreen("Inicio")
            }
        }
    }
}

@Composable
fun HomeScreen(titles : String){
   Scaffold(
       topBar = {
           TopAppBar(
             title = {
                 Text(titles,
                     style = TextStyle(
                 color = Color.White,
                 fontSize = 20.sp
             ))},
       elevation = 10.dp,
      backgroundColor = colorResource(id = R.color.greeApp))
         },
  content = {
      CodyCard()
  },
   floatingActionButton = {
     FloatingActionButton(onClick = {

     },
     backgroundColor =
     colorResource(id = R.color.greeApp)) {
         Icon(imageVector = Icons.Default.Add,
         contentDescription = "",
             tint = Color.White
         )
     }
   })
}

@Composable
fun CodyCard(){
 Card(
     shape = RoundedCornerShape(15.dp),
 backgroundColor = Color.White,
 elevation = 5.dp,
 modifier = Modifier
     .padding(10.dp)
     .width(180.dp)) {

     Column(modifier = Modifier.padding(10.dp)) {
       Image(
           painter = painterResource(id = R.drawable.cody),
       contentDescription = "",
       modifier = Modifier.size(140.dp))
     }
 }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyFirsAppTheme {
        HomeScreen("Inicio")
    }
}