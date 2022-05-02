import kotlin.random.Random

fun main() {


    fun createTeam(): MutableList<AbstractWarrior> {
        var newTeam = mutableListOf<AbstractWarrior>()
        println("How many warriors do you want to have on this team")
        val nWarriors = readLine()?.toInt()
        if (nWarriors != null) {
            newTeam = Team().getTeam(nWarriors)
        } else {
            println("Please enter the number")
            createTeam()
        }
        return newTeam
    }
}

fun Int.probability(): Boolean {
    return this <= Random.nextInt(0, 100)
}