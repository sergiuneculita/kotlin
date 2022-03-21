import kotlin.random.Random
import kotlin.random.nextInt

class Fish(name: String = "Nemo", energy: Int = 6, weight: Int = 3, maxAge: Int = 3) :
    Animals(name, energy, weight, maxAge) {

  override var currentAge: Int = 1


    override fun move() {
        super.move()
        if (moving) {
            println("Swim")
        }
    }


    override fun multiply(): Fish {
        val child = Fish(name + "+", Random.nextInt(1..10), Random.nextInt(1..5), maxAge)
        child.currentAge = 1
        println("${name + "+"} was born (energy = ${child.energy}," +
                " weight = ${child.weight}," +
                " maximum age ${child.maxAge} )")
        return child
    }

}