class Battle {
    val firstTeam = Team().getTeam(30)
    val secondTeam = Team().getTeam(30)
    var endBattle = false
    fun getStatusOfBattle(){
        when {
            firstTeam.isNotEmpty() && secondTeam.isNotEmpty() -> {
                BattleState.Progress()
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


}