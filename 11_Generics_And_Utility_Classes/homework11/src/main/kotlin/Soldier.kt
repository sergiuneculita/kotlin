class Soldier(soldierWeapon: AbstractWeapon) : AbstractWarrior() {
    override val maxHealth: Int = 60
    override val accuracy: Int = 50
    override val weapon = soldierWeapon
    override var currentHealthPoint: Int = 50
    override var isKilled: Boolean = currentHealthPoint <= 0
    override val chanceNotGetDamage: Int = 50


    override fun attack(enemy: Warrior) {
        super.attack(enemy)
    }

    override fun takeDamage(quantityDamage: Int) {
        super.takeDamage(quantityDamage)
    }
}