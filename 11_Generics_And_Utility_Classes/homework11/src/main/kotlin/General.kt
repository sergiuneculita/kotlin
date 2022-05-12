class General(

) : AbstractWarrior() {
    override val maxHealth: Int = 100
    override val accuracy: Int = 60
    override val weapon: AbstractWeapon = Weapons.createPistol()
    override var currentHealthPoint: Int = 100
    override var isKilled = currentHealthPoint <= 0

    override val chanceNotGetDamage: Int = 80

    override fun attack(enemy: Warrior) {
        super.attack(enemy)
    }

    override fun takeDamage(quantityDamage: Int) {
        super.takeDamage(quantityDamage)
    }
}