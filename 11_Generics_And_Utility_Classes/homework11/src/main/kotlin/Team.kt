import kotlin.random.Random

class Team {
    fun getTeam(warriorQuantity: Int = 30): MutableList<AbstractWarrior> {
        val teamList = mutableListOf<AbstractWarrior>()
        for (i in 1..warriorQuantity) {
            when (Random.nextInt(1, 100)) {
                in 1..10 -> teamList.add(General())
                in 11..40 -> teamList.add(Captain())
                in 41..60 -> teamList.add(Soldier(Weapons.createAk47()))
                in 61..100 -> teamList.add(Soldier(Weapons.createM39()))
            }
        }
        return teamList
    }
}