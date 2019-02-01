package com.tcs.mobile

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    var edad = 4
    var altura:Double = 1.6

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val leon:Animal = Animal(SexType.MALE)
        leon.name = "Simba"
        Log.v("JUNGLE",leon.life.toString())

        val valueName = leon.name.toString()
        this.txtTitle.text = "Soy: $valueName"

        this.solucionOne()

    }
    fun solucionOne(){
        //mutable
        var listProducts = mutableListOf<Product>()
        listProducts.add(Product(2.0))

        val productA = Product(2)
        productA.company = "Motorola"

        val productB = Product(3)
        val productC = Product(4)

        listProducts.add(productA)
        listProducts.add(productB)
        listProducts.add(productC)

        Log.v("JUNGLE",listProducts[1].company.toString())
        //no mutable
        var list:List<Product> = listOf(productA,productB,productC)
        //lo compro lenovo
        productA.company = "Lenovo"
        Log.v("JUNGLE",list[0].company.toString())
    }
}
