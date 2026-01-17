package ktln_youtube

import kotlin.system.exitProcess

fun main(){

    val moscowCoffeeShop = MoscowCoffeeShop(3.0, 4.50, 5.0)
    val newYorkCoffeeShop = NewYorkCoffeeShop(5.0, 7.50, 8.0)
    var currentCoffeeShop: CoffeeShop


    while (true) {
        println("Hello. Choose a city:")
        println("1. Moscow\n2. New York\n\n0. Exit")

        currentCoffeeShop = when (readln()) {
            "1" ->
                moscowCoffeeShop

            "2" ->
                newYorkCoffeeShop

            "0"-> {
                println("Good Bye!")
                break
            }

            else -> {
                println("Error")
                continue
            }
        }

        chooseDrink(currentCoffeeShop)

        println("Choose a drink:")
        println("1. Americano\n2. Cappuccino\n3. Latte\n\n0. Show Statistics")
    }
}

private fun checkAndAskForBiscuits(currentCoffeeShop: CoffeeShop){
    if (currentCoffeeShop is Biscuits) {
        println("Would you like biscuits?")
        println("1. Yes\n2. No")

        val isBiscuits = readln()

        if (isBiscuits == "1")
            currentCoffeeShop.sellBiscuits()
        else {
            println("Good Bye!")
        }
    }
}

private fun chooseDrink(currentCoffeeShop: CoffeeShop){
    when (readln()) {
        "1" -> {
            currentCoffeeShop.makeAmericano()
            checkAndAskForBiscuits(currentCoffeeShop)
        }
        "2" -> {
            currentCoffeeShop.makeCappuccino()
            checkAndAskForBiscuits(currentCoffeeShop)
        }
        "3" -> {
            currentCoffeeShop.makeLatte()
            checkAndAskForBiscuits(currentCoffeeShop)
        }
        "0" -> currentCoffeeShop.showStatistics()

        else -> {
            println("Error")
            exitProcess(1)
        }
    }
}