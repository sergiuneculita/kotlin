import kotlin.random.Random
import kotlin.random.nextInt

class Battle {

    var endBattle = false
    fun getStatusOfBattle(echipa1:MutableList<AbstractWarrior>, echipa2:MutableList<AbstractWarrior>) {
        val firstTeam = echipa1
        val secondTeam = echipa2
        when {
            firstTeam.isNotEmpty() && secondTeam.isNotEmpty() -> {
                BattleState.Progress()
                endBattle = false

            }
            firstTeam.isEmpty() && secondTeam.isEmpty() -> {
                endBattle = true
                BattleState.Draw()

            }
            firstTeam.isEmpty() -> {
                endBattle = true
                BattleState.WonFirstTeam()


            }
            secondTeam.isEmpty() -> {
                endBattle = true
                BattleState.WonSecondTeam()

            }
        }
    }

    fun battleProgress(echipa1: MutableList<AbstractWarrior>, echipa2 : MutableList<AbstractWarrior>) {
        val firstTeamUpdate = echipa1
        val secondTeamUpdate = echipa2
        for (i in 0..20) {
            if (endBattle) println("the battle is over")
            else {
                val playerFirstTeam = firstTeamUpdate[Random.nextInt(0, firstTeamUpdate.size)]
                val playerSecondTeam = secondTeamUpdate[Random.nextInt(0, secondTeamUpdate.size)]
                if (!playerFirstTeam.isKilled)
                    playerFirstTeam.attack(secondTeamUpdate[Random.nextInt(0, secondTeamUpdate.size)])
                getStatusOfBattle(firstTeamUpdate,secondTeamUpdate)


                if (!playerSecondTeam.isKilled)
                    playerSecondTeam.attack(firstTeamUpdate[Random.nextInt(0, firstTeamUpdate.size)])
                getStatusOfBattle(firstTeamUpdate,secondTeamUpdate)


            }
        }
        BattleState.Progress().info(firstTeamUpdate,secondTeamUpdate)
    }

}