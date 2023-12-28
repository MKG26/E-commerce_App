package com.example.e_commerce_app.data

import com.example.e_commerce_app.R
import com.example.e_commerce_app.model.Grid
import com.example.e_commerce_app.model.GridThree
import com.example.e_commerce_app.model.Gridtwo

class DataSource() {

    fun loadGrids(): List<Grid>{
        return listOf<Grid>(
            Grid(R.string.grid1,R.drawable.grid1),
            Grid(R.string.grid2,R.drawable.grid2),
            Grid(R.string.grid3,R.drawable.grid3),
            Grid(R.string.grid4,R.drawable.grid4),
            Grid(R.string.grid5,R.drawable.grid5)
        )
    }


    fun loadGridstwo(): List<Gridtwo>{
        return listOf<Gridtwo>(
            Gridtwo(R.drawable.eco),
            Gridtwo(R.drawable.eco2)
        )
    }

    fun loadGridsThree(): List<GridThree>{
        return listOf<GridThree>(
            GridThree(R.drawable.glasss),
            GridThree(R.drawable.sweatshirt),
            GridThree(R.drawable.notebook),
            GridThree(R.drawable.bag)
        )
    }
}