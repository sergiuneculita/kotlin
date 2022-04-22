class Soldier: AbstractWarrior() {
    override val maxHealth: Int = 50

    override val accuracy: Int = 50

    override val weapon = Weapons.createSniperWeapon()

    override val currentHealthPoint: Int = maxHealth

}