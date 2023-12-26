package com.example.e_commerce_app.ui

import androidx.annotation.StringRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.e_commerce_app.R
import com.example.e_commerce_app.data.DataSource
import com.example.e_commerce_app.model.Grid

@Composable
fun thirdLayer(viewModel: E_commerceViewModel = androidx.lifecycle.viewmodel.compose.viewModel(),){

    var amountInput by remember {
        mutableStateOf("")
    }

    Scaffold(

        topBar = {
            ecoTopBar()
        }

    ) {it
        Column(modifier = Modifier.padding(top = 52.dp)) {


            customTextField(
                value = amountInput,
                onValueChange = { amountInput = it },


                label = R.string.search


            )


            Box(
                modifier = Modifier
                    .height(110.dp)
                    .background(Color(0xFF8DD4FC))
            ) {
                GridList(
                    gridList = DataSource().loadGrids(),
                    modifier = Modifier

                    )
            }



        }

    }
}

@Composable
fun GridList(gridList: List<Grid>, modifier: Modifier = Modifier){

    LazyHorizontalGrid(
        rows = GridCells.Fixed(1),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier
            .height(110.dp)
            .padding(top = 10.dp)
    ){
        items(gridList){ grid ->

            GridCard(
                grid = grid,
                modifier = Modifier
            )

        }
    }
}


@Composable
fun GridCard(grid: Grid, modifier: Modifier = Modifier){

    Card(modifier = modifier
        .width(80.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFF8DD4FC)
        )

        ) {
        Column(
            modifier = Modifier

        ) {

            Image(
                painter = painterResource(id = grid.imageResourceId),
                contentDescription = stringResource(id = grid.stringResourceId),
                modifier = Modifier
                    .size(70.dp)
                    .background(Color.White, shape = RoundedCornerShape(20.dp))

                    .padding(8.dp)




            )




            Text(
                text = stringResource(id = grid.stringResourceId),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            )
        }
    }
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
            .width(420.dp)

    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ecoTopBar(){

    CenterAlignedTopAppBar(
        title = {
            Text(
                text = stringResource(id = R.string.app),
                style = MaterialTheme.typography.displayLarge,
                modifier = Modifier
                    .height(45.dp)
            )


        },

        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(Color(0xFF8DD4FC)),
    )

}