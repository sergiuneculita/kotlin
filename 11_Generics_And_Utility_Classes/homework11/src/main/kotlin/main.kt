import kotlin.random.Random

fun main() {



}

fun Int.probability():Boolean{
    return this <= Random.nextInt(0,100)
}