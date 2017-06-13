package hello.kotlin

fun main(args: Array<String>){
    val a: Int=1
    var b: Int
    b=2
    var c=3

    //extension functions
    infix fun String.hello(greeting: String)="$greeting, $this"
    // infix
    println("World" hello "Hello" )

    //operator
    operator fun String.unaryMinus():List<String>{
        return this.split(" ")
    }

    println(-"Hello World")
    
}

fun sum(a: Int,b: Int): Int{
    return a+b
}
//inline
fun sum2(a: Int,b: Int)=a+b
//Unit é o mesmo que void e pode ser omitido
fun printSum(a: Int,b: Int): Unit{
    println("soma de $a e $b é ${a + b}")
}
/* 
usar comentários de várias linhas
é igual ao Java*/
fun printSum2(a: Int, b: Int=0) {
    println("soma de $a e $b é ${a + b}")
}