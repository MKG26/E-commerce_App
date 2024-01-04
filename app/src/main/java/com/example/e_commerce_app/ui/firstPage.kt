package com.example.e_commerce_app.ui

import androidx.annotation.StringRes
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.e_commerce_app.R
import com.example.e_commerce_app.ui.theme.Ecommerce_AppTheme

@Composable
fun frontPage(
    onNextButtonClicked: () -> Unit,
    modifier: Modifier = Modifier
) {


    var amountInput by remember {
        mutableStateOf("")
    }


    Column(
        modifier = modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {


        Canvas(modifier = Modifier) {
            translate(left = -630f, top = 360f,) {
                drawCircle(color = Color(0xFFCEE8F7), radius = 100.dp.toPx())
            }
        }

        Canvas(modifier = Modifier) {
            translate(left = -370f, top = 60f,) {
                drawCircle(color = Color(0xFF8DD4FC), radius = 100.dp.toPx(),alpha = 0.8f)
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
            style = MaterialTheme.typography.displayLarge,
            modifier = Modifier
                .padding(top = 20.dp)
        )

        Spacer(modifier = Modifier.padding(13.dp))


        CustomTextField(
            value = amountInput,
            onValueChange = {amountInput = it},
            modifier = Modifier
            ,



            label = R.string.mobile


        )


        Spacer(modifier = Modifier.padding(15.dp))



        Text(
            text = stringResource(id = R.string.lohinVia),
            style = MaterialTheme.typography.displayMedium
        )


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

        Spacer(modifier = Modifier.padding(24.dp))

        Button(
            onClick = onNextButtonClicked,
            modifier = Modifier
                .width(300.dp)
                .height(53.dp)




        ) {

            Text(
                text = stringResource(id = R.string.login),
                style = MaterialTheme.typography.displaySmall


            )


        }

        Spacer(modifier = Modifier.padding(5.dp))

        Text(
            text = stringResource(id = R.string.signUp),
            style = MaterialTheme.typography.bodySmall

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
        label = { Text(text = stringResource(id = label)) },
        modifier = Modifier
            .width(320.dp)

    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPrevie(){
    Ecommerce_AppTheme {
        frontPage(onNextButtonClicked = { /*TODO*/ })
    }
}