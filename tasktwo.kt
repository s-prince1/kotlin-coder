
class student{
    var name = ""
    var roll_no = 0
    var dob = ""
}

class Car(var name: String, var roll_no: Int, var dob: String)

fun main(){
    
    var c1 = student()
    c1.name = "prince"
    c1.roll_no = 1
    c1.dob = "26/11/2003"

    print(c1.name)
    print("\t")
    print(c1.roll_no)    
    print("\t")
    println(c1.dob)


    val c2 = Car("goku", 2, "15/05/1986")
    print(c2.name)
    print("\t")
    print(c2.roll_no)
    print("\t")
    println(c2.dob)

val list1 = listOf("goku","vegeta")
for (i in list1){
    print(i)
    print("\t")
}
println()

val list2 = mutableListOf("goku","vegeta","luffy")
list2.add("trunks")
for (i in list2){
    print(i)
    print("\t")
}
println()

list2.removeAt(2)
for (i in list2){
    print(i)
    print("\t")
}
println()

println("SET")

val set1 = setOf("goku","vegeta")
for (i in set1){
    print(i)
    print("\t")
}
println()

val set2 = mutableSetOf("goku","vegeta","luffy")
set2.add("trunks")
for (i in set2){
    print(i)
    print("\t")
}
println()

set2.remove("luffy")
for (i in set2){
    print(i)
    print("\t")
}
println()


println("MAP")
val map1 = mapOf("goku" to 1, "vegeta" to 2, "luffy" to 3)
for (i in map1){
    print(i)
    print("\t")
}
println()

val map2 = mutableMapOf("goku" to 1, "vegeta" to 2)
map2.put("broly", 3)  
map2.remove("vegeta") 
for (i in map2){
    print(i)
    print("\t")
}

}