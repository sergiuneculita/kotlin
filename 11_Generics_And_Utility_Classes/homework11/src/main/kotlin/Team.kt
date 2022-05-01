import kotlin.random.Random

class Team {
    val teamList = mutableListOf<AbstractWarrior>()
    fun getTeam(warriorQuantity: Int = 30): MutableList<AbstractWarrior> {
        for (i in 1..warriorQuantity) {
            when (Random.nextInt(1, 100)) {
                in 1..10 -> teamList.add(General())
                in 11..40 -> teamList.add(Captain())
                in 41..100 -> teamList.add(Soldier())
            }
        }
        return teamList
    }
}