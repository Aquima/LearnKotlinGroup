package com.tcs.mobile

class Product (id:Int){
    constructor(price:Double):this(0)  {
        this.price = price
    }
    val idProduct:Int = id
    var price:Double = 0.0
    lateinit var company:String
}