sealed class BattleState {
   class Progress : BattleState() {
      fun info(firstTeam: MutableList<AbstractWarrior>, secondTeam: MutableList<AbstractWarrior>){
         println("Sum of first team health ${firstTeam.sumOf { it.currentHealthPoint}},\n" +
                 " sum of second team health ${secondTeam.sumOf { it.currentHealthPoint }}")
         println("Sum of warriors in the first team - ${firstTeam.size},\n" +
                 " number of warriors in the second team - ${secondTeam.size}")
         println("in first team are :\n Soldier = ${firstTeam.count{ it is Soldier}},\n" +
                 " Captain = ${firstTeam.count{ it is Captain}},\n General = ${firstTeam.count{ it is General}}")
         println("in second team are:\n Soldier = ${secondTeam.count{ it is Soldier}},\n" +
                 " Captain = ${secondTeam.count{ it is Captain}},\n General = ${secondTeam.count{ it is General}}")
      }
   }
   class WonFirstTeam: BattleState()
   class  WonSecondTeam: BattleState()
   class Draw: BattleState()


}



