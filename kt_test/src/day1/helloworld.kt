package day1

fun printBorder(border:String, timeBorder:Int){
    repeat(timeBorder){
        print(border)
    }
    println()
}
fun main(){
    val border="`-._,-'"
    val time=4
    val name="kotlin"
    printBorder(border,time)
    println("Happy Birthday, ${name}!")
    printBorder(border,time)
}