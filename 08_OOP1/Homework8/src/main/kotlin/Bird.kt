import kotlin.random.Random
import kotlin.random.nextInt

class Bird(name: String = "Pasare", energy: Int = 9, weight: Int = 2, maxAge: Int = 4) :
    Animals(name, energy, weight, maxAge) {

    override var currentAge: Int = 2

    override fun move() {
        super.move()
        if (moving) {
            println("Flight")
        }
    }


    override fun multiply(): Bird {
        val child = Bird(name + "+", Random.nextInt(1..10), Random.nextInt(1..5), maxAge)
        child.currentAge = 1
        println("${name + "+"} was born (energy = ${child.energy}," +
                " weight = ${child.weight}," +
                " maximum age ${child.maxAge} )")
        return child
    }

}