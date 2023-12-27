package com.example.e_commerceapp_secondpage

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.e_commerce_app.R
import com.example.e_commerceapp_secondpage.ui.theme.ECommerceApp_secondPageTheme

private const val TAG = "MainActivity"
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG,"onCreate Called")
        setContent {
            ECommerceApp_secondPageTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = colorScheme.background
                ) {
                    SecondPage()
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart Called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume Called")
    }

    override fun onPause(){
        super.onPause()
        Log.d(TAG,"onPause Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"onDestroy Called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"onStop Called")
    }
}

@Composable
fun SecondPage(modifier : Modifier = Modifier) {



    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Canvas(modifier = Modifier) {
            translate(left = -630f, top = 360f,) {
                drawCircle(color = Color(0xFFCEE8F7), radius = 100.dp.toPx())
            }
        }

        Canvas(modifier = Modifier) {
            translate(left = -370f, top = 60f,) {
                drawCircle(color = Color(0xFF8DD4FC), radius = 100.dp.toPx(), alpha = 0.8f)
            }
        }


        Text(
            text = stringResource(id = R.string.app_name),
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier
                .padding(top = dimensionResource(id = R.dimen.padding_medium))
        )

        Spacer(
            modifier = Modifier.height(200.dp)
        )

        MiddleSection(
            modifier = Modifier
                .background(
                    color = Color(0xFFF2FDFF)
                )
        )

        Spacer(modifier = Modifier.height(30.dp))


        Button(
            onClick = { },
            modifier = Modifier
                .padding(
                    dimensionResource(id = R.dimen.padding_medium),
                ),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF7BD0FF)
            )

        ){
            Text(
                text = stringResource(id = R.string.signUpButton),
                fontWeight = FontWeight.Bold,
                color = colorScheme.onBackground,
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier
                    .padding(
                        top = dimensionResource(id = R.dimen.extra_padding_small),
                        bottom = dimensionResource(id = R.dimen.extra_padding_small),
                        end = dimensionResource(id = R.dimen.padding_extra_large),
                        start = dimensionResource(id = R.dimen.padding_extra_large)
                    )
            )

        }

    }
}

@Composable
fun MiddleSection(
    modifier: Modifier = Modifier,
){
    var userName by rememberSaveable {
        mutableStateOf("")
    }

    var mobileNumber by rememberSaveable {
        mutableStateOf("0")
    }

    var password by rememberSaveable {
        mutableStateOf("")
    }

    Column (
        modifier = modifier
            .fillMaxWidth()

    )
    {
        Text(
            text = stringResource(id = R.string.create_account),
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(
                    top = dimensionResource(id = R.dimen.padding_small),
                    start = dimensionResource(id = R.dimen.padding_medium)
                )
        )


        Box(
            modifier = Modifier
                .padding(dimensionResource(id = R.dimen.padding_small)),
//                .background(
//                    color = colorScheme.onBackground,
//                    shape = RoundedCornerShape(R.dimen.padding_small)
//                )

        ){
            Column {
                Text(
                    text = stringResource(id = R.string.mobile_no),
                    style = typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(start = dimensionResource(id = R.dimen.padding_large),
                            top = dimensionResource(id = R.dimen.padding_small))

                )


                OutlinedTextField(
                    value = mobileNumber,
                    onValueChange = { } ,
                    modifier = Modifier
                        .padding(
                            top = dimensionResource(id = R.dimen.padding_medium),
                            start = dimensionResource(id = R.dimen.padding_large),
                            bottom = dimensionResource(id = R.dimen.padding_medium)
                        )
                        .height(20.dp),
                    singleLine = true
                )


                Text(
                    text = stringResource(id = R.string.user_name),
                    style = typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(start = dimensionResource(id = R.dimen.padding_large),
                            top = dimensionResource(id = R.dimen.padding_small))
                )

                TextField(
                    value = userName,
                    onValueChange = { },
                    modifier = Modifier
                        .padding(
                            top = dimensionResource(id = R.dimen.padding_medium),
                            start = dimensionResource(id = R.dimen.padding_large),
                            bottom = dimensionResource(id = R.dimen.padding_medium)
                        )
                        .height(20.dp),
                    isError = false,
                )

                Text(
                    text = stringResource(id = R.string.password),
                    style = typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(start = dimensionResource(id = R.dimen.padding_large),
                            top = dimensionResource(id = R.dimen.padding_small))
                )

                TextField(
                    value = password,
                    onValueChange = { },
                    modifier = Modifier
                        .padding(
                            top = dimensionResource(id = R.dimen.padding_medium),
                            start = dimensionResource(id = R.dimen.padding_large),
                            bottom = dimensionResource(id = R.dimen.padding_large)
                        )
                        .height(20.dp),
                    isError = false,
                )

                Spacer(modifier = Modifier.height(80.dp))

                Text(
                    text = stringResource(id = R.string.already_customer),
                    style = typography.titleLarge,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(
                            start = dimensionResource(id = R.dimen.padding_medium)
                        )
                )

                Text(
                    text = stringResource(id = R.string.sign_instead),
                    modifier = Modifier
                        .padding(
                            top = dimensionResource(id = R.dimen.extra_padding_small),
                            start = dimensionResource(id = R.dimen.padding_medium)
                        ),
                    color = Color(0xFF035EC9)
                )

            }
        }
    }
}

@Composable
private fun TextField(
    value:String,
    onValueChange : (String) -> Unit,
    modifier: Modifier = Modifier,
    isError : Boolean
){
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        singleLine = true,
        keyboardOptions = KeyboardOptions
            .Default.copy(
                imeAction = ImeAction.Next,
            ),
        isError = isError,
        modifier = modifier
    )
}



@Preview(showBackground = true)
@Composable
fun SeconPagePreview() {
    ECommerceApp_secondPageTheme {
        SecondPage()
    }
}