package classes

fun main(args: Array<String>){
    val bike: Bike=Bike()

    with(bike){
        throttle()
        turn(10)
    }
}

open class Bike {
    var speed: Int
    var direction: Int
    constructor(){
        speed=0
        direction=0
    }
    
    open fun throttle(): Int=speed++
    
    fun turn(degrees: Int){
        direction=degrees
    }

    fun stop(){
        speed=0
    }
}

class SportBike: Bike(){
    override fun throttle(): Int{
    speed+=10
    return speed
    }
}

class Person constructor(firstName: String) {
}

class PersonShort(firstName: String) {
}

class Customer(name: String) {
    init {
        println("Customer initialized with value ${name}")
    }
}

class DontCreateMe private constructor () {
}

//não há métodos estáticos, use funções em nível de pacote ou Companion objects: http://kotlinlang.org/docs/reference/object-declarations.html#companion-objects