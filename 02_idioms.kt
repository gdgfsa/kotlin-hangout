package idioms

/*POJO. val gera um get. var gera get e set
equals()
hashCode()
toString()
copy()
*/
data class Customer(val name: String, var email: String)

fun main(args:Array<String>){
    //var name: String = "Kotlin"
    //name = null // error

    var name: String? = "Kotlin"
    name = null // is ok!

    //println(name?.length) //se for null, não faz nada
    //println(name?.length ?: "empty") //se for null, se não retorna empty
    //println(name!!.length) //tiro no pé
    name?: println("null") //executa se for null

    var list=arrayOf(0,1,2,3,4)
    var positives = list.filter { x -> x > 0 }
    positives = list.filter { x -> x > 0 }

    val customer: Customer=Customer("GDG","fsagdg@gmail.com")

    when(customer){
        is Customer-> println(customer.name)
        else-> println("Não é Customer")
    }

    when(customer.name){
        "GDG"-> println("É o GDG")
        else -> println("Não é o GDG")
    }

    val map = mapOf("a" to 1, "b" to 2, "c" to 3)

    for ((k, v) in map) {
        println("$k -> $v")
    }

    /*for (i in 1..100) { ... }  // closed range: includes 100
    for (i in 1 until 100) { ... } // half-open range: does not include 100
    for (x in 2..10 step 2) { ... }
    for (x in 10 downTo 1) { ... }
    if (x in 1..10) { ... }*/

    //extension functions
    infix fun String.hello(greeting: String)="$greeting, $this"
    println("World".hello("Hello"))

    println(Resource.name)

    val bike: Bike=Bike()

    with(bike){
        throttle()
        turn(10)
    }

    println(fun123(1))
}
object Resource {
    val name = "GDG"
}

class Bike {
    var speed: Int
    var direction: Int
    constructor(){
        speed=0
        direction=0
    }
    
    fun throttle(): Int=speed++
    
    fun turn(degrees: Int){
        direction=degrees
    }
}

fun count(initValue:Int=10):Int {
    var result = try {
        initValue+1
    } catch (e: ArithmeticException) {
        throw IllegalStateException(e)
    }
    return result
}

fun fun123(param:Int=3):String{
    val result = if (param == 1) {
        "one"
    } else if (param == 2) {
        "two"
    } else {
        "three"
    }
    return result
}