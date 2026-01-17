fun main() {
    val calibrationData = getCalibrationData()
    println("Эталонные размеры астероидов:")
    displayAsteroids(calibrationData)
}

fun displayAsteroids(asteroids: Array<Int>) {
    if (asteroids.size == 0) {
        println("Астероиды не обнаружены")
        return
    }
    for (i in asteroids.indices) {
        println("Астероид ${i+1}: ${asteroids[i]} м")
    }
}

fun getCalibrationData() {

}