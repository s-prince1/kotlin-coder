

import kotlin.reflect.typeOf
fun main(){
    val num = 5 
    val double = 5.99
    val char = 'p'
    val bool = true
    val str= "prince"   
    println(num)
    println(bool)

    val Snum : String = "5"
    println(Snum)
    
    var name = "luffy"
    val sname : String = "goku"

    println(name)
    println(sname)


    val x = 3 
    val y = 2
    if (x % 2==0 && y % 2==0) {
        println("Both numbers are even numbers")
    } else if(x % 2==1 && y % 2==1) {
        println("Both numbers are odd numbers")
    }
    else{
        println("One number is even and another number is odd")
    }    

    
    for (i in 1..5) {
        if (i % 2 == 0) {
            println("even number "+i)
        }else {
            println("odd number " +i)
        }
    }

    prince()
}

fun prince(){
    println("hello")
}