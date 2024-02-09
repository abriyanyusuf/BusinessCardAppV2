package com.example.businesscardappv2

import androidx.compose.ui.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Language
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.rounded.Verified
import androidx.compose.material.icons.rounded.VerifiedUser
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardappv2.ui.theme.BusinessCardAppV2Theme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.filled.Verified
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Verified
import androidx.compose.material.icons.rounded.TravelExplore
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppV2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Contact() // Use Color.BLACK directly
                    //CompanyLogo()
                }
            }
        }
    }
}



@Composable
fun BusinessAppScreenV2(

) {




}

@Composable
fun CompanyLogo(

) {

    Box {
        val imageBG = painterResource(id = R.drawable.painting_6556384_1280)

        Image(
            painter = imageBG,
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .scale(2f) // Menentukan lebar gambar agar memenuhi layar
            //.aspectRatio(2.0f) // Menentukan rasio aspek gambar 2:1
            //.fillMaxHeight()
            //.fillMaxWidth()


        )

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .fillMaxHeight()
                .padding(top = 200.dp)

        ) {
            val imageCompLogo = painterResource(id = R.drawable.logo_2150297_1280)



            Image(
                painter = imageCompLogo,
                contentDescription = null,
                modifier = Modifier
                    .padding(10.dp)
                    .size(180.dp) // Mengubah ukuran gambar menjadi 100dp
                    .clip(CircleShape)


            )
            Text(
                text = "Machine Learning Engineer",
                modifier = Modifier.padding(
                    top = 1.dp,
                    bottom = 8.dp,
                ),
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,

                )


        }
    }
}

@Composable
fun Contact() {

    Box {
        val imageBG = painterResource(id = R.drawable.blue_1606935_1280)

        Image(
            painter = imageBG,
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .scale(2f) // Menentukan lebar gambar agar memenuhi layar
                .rotate(degrees = 90f)
            //.aspectRatio(2.0f) // Menentukan rasio aspek gambar 2:1
            //.fillMaxHeight()
            //.fillMaxWidth()


        )

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(space = 5.dp),
            modifier = Modifier
                .fillMaxSize()
                .fillMaxHeight()
                .padding(top = 100.dp)

        ) {
            val imageCompLogo = painterResource(id = R.drawable.logo_2150297_1280)



            Image(
                painter = imageCompLogo,
                contentDescription = null,
                modifier = Modifier
                    .padding(10.dp)
                    .size(180.dp) // Mengubah ukuran gambar menjadi 100dp
                    .clip(CircleShape)


            )
            Text(
                text = stringResource(R.string.MyName),
                modifier = Modifier.padding(
                    top = 1.dp,
                    bottom = 8.dp,
                ),

                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                color = Color.White
                )

            Text(
                text = stringResource(R.string.MyJob),
                modifier = Modifier
                    .padding(
                    top = 1.dp,
                    bottom = 8.dp,
                ),
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                color = Color.White,
                fontStyle = FontStyle.Italic


                )



        }
    }

    Column(
        verticalArrangement = Arrangement.spacedBy(space = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.offset(y = 500.dp)

    ) {


        //Row for Contact Number
        Row(
        ) {
            Icon(
                modifier = Modifier
                    .height(30.dp)
                    .width(30.dp)
                    .background(color = Color.Transparent),
                imageVector = Icons.Rounded.Call,
                contentDescription = "call icon",
                tint = Color.White
            )

            Text(
                text = stringResource(R.string.MyPhNumber),
                modifier = Modifier
                    .offset(x = 15.dp),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )

        }

        //Row for Contact Email
        Row(
            verticalAlignment = Alignment.CenterVertically

        ) {
            Icon(
                modifier = Modifier
                    .height(30.dp)
                    .width(30.dp)
                    .background(color = Color.Transparent),
                imageVector = Icons.Outlined.Email,
                contentDescription = "call icon",
                tint = Color.White
            )

            Text(
                text = stringResource(R.string.MyEmail),
                modifier = Modifier
                    .offset(x = 15.dp),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )

        }

        //Row for Website
        Row(

        ) {
            Icon(
                modifier = Modifier
                    .height(30.dp)
                    .width(30.dp)
                    .background(color = Color.Transparent),
                imageVector = Icons.Rounded.TravelExplore,
                contentDescription = "Browser Icon",
                tint = Color.White
            )

            Text(
                text = stringResource(R.string.MyWeb),
                modifier = Modifier
                    .offset(x = 15.dp),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )

        }

        //Row for Verified Logo
        Row(
            modifier = Modifier.offset(y = 50.dp),
            verticalAlignment = Alignment.CenterVertically


        ) {
            Icon(
                modifier = Modifier
                    .size(50.dp)
                    //.background(color = Color.White)

                    .clip(CircleShape),

                imageVector = Icons.Outlined.Verified,
                contentDescription = "Verified Logo",
                tint = Color.Green
            )

            Text(
                text = stringResource(R.string.verified),
                modifier = Modifier
                    .offset(x = 15.dp),
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )

        }
    }



}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    BusinessCardAppV2Theme {
        Contact() // Use Color.BLACK directly
        //CompanyLogo()
    }
}
