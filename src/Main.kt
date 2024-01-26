import kotlin.math.abs
import kotlin.random.Random

fun main() {
    val temperature = Random.nextDouble(92.0, 104.0)

    println("Enter the temperature:")
    val userTemperature = readLine()?.toDouble() ?: 0.0

    val temperatureDifference = abs(userTemperature - 97.5)

    when {
        userTemperature < 97.5 -> println("Low temperature: $userTemperature")
        temperatureDifference <= 2.0 -> println("Normal temperature: $userTemperature")
        else -> println("High temperature: $userTemperature")
    }
}