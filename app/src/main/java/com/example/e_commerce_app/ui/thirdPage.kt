package com.example.e_commerce_app.ui

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.e_commerce_app.R
import java.lang.reflect.Modifier

@Composable
fun thirdLayer(){

    var amountInput by remember {
        mutableStateOf("")
    }

    Scaffold(

        topBar = {
            ecoTopBar()
        },

     content = {it
         Column() {



             customTextField(
                 value = amountInput,
                 onValueChange = { amountInput = it },




                 label = R.string.mobile


             )


         }

     })
}



@Composable
fun customTextField(
    value: String,
    @StringRes label: Int,
    onValueChange: (String) -> Unit,
) {



    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(text = stringResource(id = label)) },
        modifier = androidx.compose.ui.Modifier
            .width(320.dp)

    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ecoTopBar(){

    CenterAlignedTopAppBar(
        title = {
            Text(
                text = stringResource(id = R.string.app),
                style = MaterialTheme.typography.displayLarge
            )


        },

        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(Color(0xFF8DD4FC)),
    )

}