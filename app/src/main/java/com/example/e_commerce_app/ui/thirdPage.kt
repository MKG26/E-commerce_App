package com.example.e_commerce_app.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.e_commerce_app.R
import com.example.e_commerce_app.ui.theme.Ecommerce_AppTheme
import javax.sql.DataSource

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
        Column(modifier = Modifier.padding(top = 64.dp)) {


            Box(
                modifier = Modifier
                    .background(color = Color(0xFF8DD4FC))

            ) {
                customTextField(
                    value = amountInput,

                    onValueChange = { amountInput = it })
            }





            Box(
                modifier = Modifier
                    .height(120.dp)
                    .background(Color(0xFF8DD4FC))
                    .padding(start = 10.dp, top = 5.dp)
            ) {
                GridList(
                    gridList = DataSource().loadGrids(),
                    modifier = Modifier

                )
            }

            Box(
                modifier = Modifier
                    .padding(top = 0.dp)
                    .height(300.dp)
            ) {
                GridtwoList(gridList = DataSource().loadGridstwo())
            }



            Text(
                text = stringResource(id = R.string.deal),
                style = MaterialTheme.typography.displayMedium,
                modifier = Modifier
                    .padding(start = 5.dp)

            )

            Box(
                modifier = Modifier
                    .height(275.dp)
                    .width(420.dp)
                    .background(Color(0xFFDDF3F7))
            ){

                GridThreeList()

            }

        }



    }
}


@Composable
fun GridtwoList(gridList: List<Gridtwo> , modifier: Modifier = Modifier){

    LazyHorizontalGrid(
        rows = GridCells.Fixed(1)
        ,
    ){
        items(gridList){grid ->

            GridtwoCard(
                grid = grid,



                )
        }

    }
}


@Composable
fun GridtwoCard(grid: Gridtwo, modifier: Modifier = Modifier){

    Column {
        Image(
            painter = painterResource(id = grid.imageResourceId),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .height(290.dp)
                .width(400.dp)

        )
    }
}

@Composable
fun GridThreeList( modifier: Modifier = Modifier){

    Column(
        modifier = modifier,


        ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp)
            ,

            horizontalArrangement = Arrangement.Center

        ) {
            Image(
                painter = painterResource(id = R.drawable.glasss),
                contentDescription = "glass",
                modifier = Modifier
                    .height(130.dp)
                    .width(130.dp)
                    .background(Color.White)
                    .padding(5.dp)


            )

            Spacer(modifier = Modifier.padding(20.dp))

            Image(
                painter = painterResource(id = R.drawable.sweatshirt),
                contentDescription = "sweatshirt",
                modifier = Modifier
                    .height(130.dp)
                    .width(130.dp)
                    .background(Color.White)
                    .padding(5.dp)

            )



        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp),

            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.notebook),
                contentDescription = "glass",
                modifier = Modifier
                    .height(130.dp)
                    .width(130.dp)
                    .background(Color.White)
                    .padding(5.dp)


            )

            Spacer(modifier = Modifier.padding(20.dp))

            Image(
                painter = painterResource(id = R.drawable.bag),
                contentDescription = "sweatshirt",
                modifier = Modifier
                    .height(130.dp)
                    .width(130.dp)
                    .background(Color.White)
                    .padding(5.dp)

            )



        }
    }
}



@Composable
fun GridList(gridList: List<Grid>, modifier: Modifier = Modifier){

    LazyHorizontalGrid(
        rows = GridCells.Fixed(1),
        horizontalArrangement = Arrangement.spacedBy(5.dp),
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
        .width(80.dp)
        ,
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


            Spacer(modifier = Modifier.padding(2.dp))


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
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit,
) {


    BasicTextField(
        value = value,
        onValueChange = onValueChange,

        textStyle = TextStyle(
            fontSize = 20.sp
        ),

        decorationBox = { innerTextField ->

            Box(

                modifier = Modifier
                    .padding(horizontal = 22.dp)
                    .fillMaxWidth()
                    .background(color = Color.White, shape = RoundedCornerShape(size = 30.dp))
                    .padding(horizontal = 16.dp, vertical = 15.dp),


                ){


                Row(
                    modifier = Modifier,

                    verticalAlignment = Alignment.CenterVertically

                ) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = null,
                        tint = Color.DarkGray,
                        modifier = Modifier
                            .padding(end = 5.dp)
                    )

                    innerTextField()

                }

                if (value.isEmpty()) {
                    Text(
                        text = "Search",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.LightGray,

                        modifier = Modifier
                            .padding(start = 30.dp)
                    )
                }






            }

        }


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

@Preview(showBackground = true)
@Composable
fun GreetingPreview(){
    Ecommerce_AppTheme {
        thirdLayer()
    }
}