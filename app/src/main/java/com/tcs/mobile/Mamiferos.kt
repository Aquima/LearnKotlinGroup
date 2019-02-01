package com.tcs.mobile

class Mamiferos(sexo: SexType) : Animal(sexo) {
    fun changeMyToSuperLife(){
        this.eating(2)
    }
}