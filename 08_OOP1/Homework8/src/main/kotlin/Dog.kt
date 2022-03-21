import kotlin.random.Random
import kotlin.random.nextInt

class Dog(name: String = "Barsic", energy: Int = 8, weight: Int = 7, maxAge: Int = 8) :
    Animals(name, energy, weight, maxAge) {
    override var currentAge: Int = 3


    override fun move() {
        super.move()
        if (moving) {
            println("Run")
        }


    }

    override fun multiply(): Dog {
        val child = Dog(name + "+", Random.nextInt(1..10), Random.nextInt(1..5), maxAge)
        child.currentAge = 1
        println("${name + "+"} was born (energy = ${child.energy}," +
                " weight = ${child.weight}," +
                " maximum age ${child.maxAge} )")
        return child
    }

}

