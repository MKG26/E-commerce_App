package com.example.e_commerce_app.ui

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.e_commerce_app.R

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
                color = MaterialTheme.colorScheme.onBackground,
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
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(start = dimensionResource(id = R.dimen.padding_large),
                            top = dimensionResource(id = R.dimen.padding_small)
                        )

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
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(start = dimensionResource(id = R.dimen.padding_large),
                            top = dimensionResource(id = R.dimen.padding_small)
                        )
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
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(start = dimensionResource(id = R.dimen.padding_large),
                            top = dimensionResource(id = R.dimen.padding_small)
                        )
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
                    style = MaterialTheme.typography.titleLarge,
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



