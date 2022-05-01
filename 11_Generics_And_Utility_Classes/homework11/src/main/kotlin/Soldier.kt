class Soldier: AbstractWarrior() {
    override val maxHealth: Int = 50
    override val accuracy: Int = 50
    override val weapon = Weapons.createAk47()
    override var currentHealthPoint: Int  = 50

}