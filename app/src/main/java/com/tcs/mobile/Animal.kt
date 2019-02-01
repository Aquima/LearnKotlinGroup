package com.tcs.mobile
enum class SexType{
    MALE,FEMALE
}
open class Animal(sexo:SexType) {
   /* constructor(sexo:SexType){
        this.sexo = sexo
    }*/
    var name:String? = null
    val sexo:SexType = sexo
    //es quiere decir que solo es de lectura desde fuera de esta clase
    public var life:Int = 0
    private set
    fun eating(meet:Int){
        this.life += meet
        this.life = 1
    }
    fun isAlive(): Boolean{
        if (this.life > 0){
            return true
        }else{
            return false
        }
    }

}