import kotlin.random.Random
import kotlin.random.nextInt

open class Animals(
   val name: String,
    var energy: Int,
    var weight: Int,
    val maxAge: Int
) {

    open var currentAge = 4


    open val istooOld: Boolean
        get() = currentAge >= maxAge


    fun sleep() {
        if (istooOld) {
            println("$name is  too old to sleep")
        } else {
            energy += 5
            currentAge += 1

            println("$name sleeping")
        }
    }


    open var moving: Boolean = false
    open fun move() {

        if (energy > 5 && weight > 1 && !istooOld) {
            energy -= 5
            weight -= 1
            println("$name  moving")
            tryIncrementAge()
            moving = true
        } else {
            if (energy < 5) println("$name don't have energy to move")
            if (weight < 1) println(" $name don't have weight to move")
            if (istooOld) println(" $name is too Old to move")
            moving = false
        }

    }

    fun eat() {
        if (istooOld) {
            println("${name} is too old to eat")
        } else {
            energy += 3
            weight += 1
            println(" $name is eating")
            tryIncrementAge()
        }
    }

    open fun tryIncrementAge(): Boolean {
        return if (Random.nextBoolean() && istooOld) {
            currentAge += 1
            true
        } else {
            false
        }
    }

    open fun multiply(): Animals {
        val child = Animals(
            name + "+",
            Random.nextInt(1..10),
            Random.nextInt(1..5), maxAge,
        )
        child.currentAge = 1
        println(
            "${name + "+"} was born (energy = ${child.energy}," +
                    " weight = ${child.weight}," +
                    " maximum age ${child.maxAge} )"
        )
        return child
    }


}