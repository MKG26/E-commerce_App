package com.example.e_commerce_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Button
import androidx.compose.material3.DividerDefaults.color
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.e_commerce_app.ui.theme.Ecommerce_AppTheme
import java.util.Stack

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Ecommerce_AppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    frontPage()
                }
            }
        }
    }
}

@Composable
fun frontPage( modifier: Modifier = Modifier) {


    var amountInput by remember {
        mutableStateOf("")
    }


    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {


        Canvas(modifier = Modifier) {
            translate(left = -630f, top = 360f,) {
                drawCircle(Color.Cyan, radius = 100.dp.toPx(), alpha = 0.3f)
            }
        }

        Canvas(modifier = Modifier) {
            translate(left = -370f, top = 60f,) {
                drawCircle(Color.Cyan, radius = 100.dp.toPx(),alpha= 0.3f)
            }
        }


        Image(
            painter = painterResource(id = R.drawable.undraw_shopping_app_flsj__1_),
            contentDescription = null,
            modifier = Modifier
                .padding(top = 200.dp)
                .size(200.dp)

        )

        Text(
            text = stringResource(id = R.string.app),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(top = 20.dp)
        )
        
        Spacer(modifier = Modifier.padding(20.dp))


        CustomTextField(
            value = amountInput,
            onValueChange = {amountInput = it},
            modifier = Modifier
                ,



            label = R.string.mobile


        )


        Spacer(modifier = Modifier.padding(17.dp))



        Text(
            text = stringResource(id = R.string.lohinVia),
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp
        )

        Spacer(modifier = Modifier.padding(5.dp))

        Row(
            modifier = Modifier


        ) {
            Image(
                modifier = Modifier
                    .size(31.dp)
                    .padding()
                    ,
                painter = painterResource(id = R.drawable.transparent_google_suite_icon_google_icon_5f7f985ccd60e3_5687494416021975968412),
                contentDescription = null
            )

            Image(
                modifier = Modifier
                    .size(32.dp)
                    .padding(start = 5.dp),
                painter = painterResource(id = R.drawable._021_facebook_icon_svg),
                contentDescription = null
            )

            Image(
                modifier = Modifier
                    .size(33.dp)
                    .padding(start = 5.dp),
                painter = painterResource(id = R.drawable.pngtree_email_icon_png_image_5065641),
                contentDescription = null
            )


        }

        Spacer(modifier = Modifier.padding(30.dp))

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .width(300.dp)
                .height(45.dp)




        ) {

            Text(
                text = stringResource(id = R.string.login),


            )


        }

        Text(
            text = stringResource(id = R.string.signUp)
        )



    }



}

@Composable
 fun CustomTextField(
    value: String,
    @StringRes label: Int,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
) {


    
        OutlinedTextField(
            value = value,
            onValueChange = onValueChange,
            label = { Text(text = stringResource(id = label))},
            modifier = Modifier
                .width(320.dp)

        )
    
          







}

