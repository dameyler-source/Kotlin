fun main(){
    val a = 10
    val b = 0

    try {
        println(a / b)
    } catch (e: ArithmeticException){
        println("Попытка деления на 0")
    }

}