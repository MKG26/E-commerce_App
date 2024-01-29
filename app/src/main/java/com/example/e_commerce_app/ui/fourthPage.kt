package com.example.e_commerce_app.ui



import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.material3.Button
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material.icons.outlined.StarHalf
import androidx.compose.material.icons.outlined.StarOutline
import androidx.compose.material.icons.outlined.ThumbUp
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.e_commerce_app.R
import com.example.e_commerce_app.ui.theme.Ecommerce_AppTheme


@Composable
fun fourthPage(

){
    var amountInput by remember {
        mutableStateOf("")
    }

    var rating_1 by remember {
        mutableStateOf(4)
    }

    Scaffold{it
        Column{

            Box(
                modifier = Modifier
                    .background(color = Color(0xFF8DD4FC))
                    .padding(top = 25.dp, bottom = 20.dp),

            ) {
                customTextField1(
                    value = amountInput,
                    onValueChange = { amountInput = it }
                )
            }

            Column(
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ){
                Image(
                    painter = painterResource(id = R.drawable.notebook),
                    contentDescription = null,
                )
            }

            Column(modifier = Modifier
                .padding(
                    top = 40.dp,
                    start = 25.dp,
                    end = 25.dp,
                    )
            )
            {
                Row{
                    Text(
                        text = stringResource(id = R.string.notebooks),
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 19.sp,
                    )
                    
                    Spacer(modifier = Modifier.width(50.dp))

                    RatiingBar(
                        modifier = Modifier
                            .size(20.dp),
                        rating = rating_1,
                        starsColor = Color.Black

                    ){
                        rating_1 = it.toInt()
                    }

                }

                Row{
                    Text(
                        text = stringResource(id = R.string.setOfBooks,4),
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 19.sp,
                    )
                    
                    Spacer(modifier = Modifier.width(250.dp))

                    Text(
                        text = stringResource(id = R.string.booksQuantitiy,102),
                        fontWeight = FontWeight.Medium,
                        fontSize = 17.sp
                    )
                }

                Column{
                    Text(
                        text = stringResource(id = R.string.info1,100),
                        fontWeight = FontWeight.Medium,
                        fontSize = 15.sp,
                        modifier = Modifier.padding(top = 5.dp)
                    )
                    Text(
                        text = stringResource(id = R.string.info2),
                        fontWeight = FontWeight.Medium,
                        fontSize = 15.sp,
                    )
                }

                Row{
                    Text(
                        text = stringResource(id = R.string.totalRupees,401),
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 17.sp,
                        modifier = Modifier.padding(top = 20.dp)
                    )

                    Spacer(modifier = Modifier.width(166.dp))

                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF7BD0FF)
                        ),
                        shape = RoundedCornerShape(15.dp),
//                        border = BorderStroke
                    ) {
                        Text(
                            text = stringResource(id = R.string.buttonBuy),
                            style = MaterialTheme.typography.titleLarge,
                            fontWeight = FontWeight.ExtraBold,
                            color = MaterialTheme.colorScheme.onBackground,
//
                        )
                    }
                }

                Text(
                    text = stringResource(id = R.string.thankYou),
                    fontWeight = FontWeight.W900,
                    fontSize = 16.sp,
                    modifier = Modifier.padding(top = 40.dp)
                )
                Text(
                    text = stringResource(id = R.string.thankYou2),
                    fontWeight = FontWeight.Medium,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(top = 2.dp, bottom = 40.dp, start = 15.dp)
                )
                
                Text(
                    text = stringResource(id = R.string.afterThank),
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 21.sp,
                    color = Color(0xFF2FB3FC)
                )


                Text(
                    text = stringResource(id = R.string.afterThank2),
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 21.sp,
                    color = Color(0xFF2FB3FC),
                    modifier = Modifier.padding(start = 75.dp)

                )
            }
        }
    }
}



@Composable
fun customTextField1(
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

@Composable
fun RatiingBar(
    modifier : Modifier = Modifier,
    rating: Int = 0,
    stars: Int = 5,
    starsColor: Color = Color.Black,
    onRatingChange: (Double) -> Unit
 ){


    Row {
        for (index in 1..stars){
            Icon(
                modifier = modifier.clickable {
                      onRatingChange(index.toDouble() )
                },
                imageVector =  if(index <= rating){
                       Icons.Default.Star
                                                  }
                else{

                        Icons.Outlined.StarOutline

                },
                contentDescription =null
             )
        }
    }
}

@Preview
@Composable
fun ecoPreview(){
    Ecommerce_AppTheme{
        fourthPage()
    }
}
