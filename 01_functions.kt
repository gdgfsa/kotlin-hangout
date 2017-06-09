package hello.kotlin

fun main(Array<String< args){
    val a: Int:1
    var b: Int
    b=2
    c=3

//inline
//infix
//operator
    
}

fun sum(a: Int,b: Int): Int{
    return a+b
}

fun sum2(a: Int,b: Int)=a+b
//Unit é o mesmo que void
fun printSum(a: Int,b: Int): Unit{
    println("soma de $a e $b é ${a + b}")
}
/* pode ser omitido
e usar comentários de várias linhas*/
fun printSum2(a: Int, b: Int=0) {
    println("soma de $a e $b é ${a + b}")
}