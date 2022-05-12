class Captain(

) : AbstractWarrior() {
    override val maxHealth: Int = 75
    override val accuracy: Int = 78
    override val weapon: AbstractWeapon = Weapons.createM39()
    override var currentHealthPoint: Int = 75
    override var isKilled: Boolean = currentHealthPoint <= 0
    override val chanceNotGetDamage: Int = 61

    override fun attack(enemy: Warrior) {
        super.attack(enemy)
    }

    override fun takeDamage(quantityDamage: Int) {
        super.takeDamage(quantityDamage)
    }
}