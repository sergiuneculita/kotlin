class Animals(val name: String, val energy: Int, val weight: Int, val currentAge: Int, val maxAge: Int) {

    val istooOld: Boolean = currentAge >= maxAge


    fun sleep() {
        energy + 5
        weight + 1
        println("$name Sleep")


    }

    fun move() {
        energy - 5
        weight - 1
        println("$name  moving")

    }

    fun eat() {
        energy + 5
        weight + 1
        println(" $name eating")
    }
}