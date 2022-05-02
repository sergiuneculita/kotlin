class Soldier: AbstractWarrior() {
    override val maxHealth: Int = 50
    override val accuracy: Int = 50
    override val weapon = Weapons.createAk47()
    override var currentHealthPoint: Int  = 50

    override var isKilled: Boolean
        get() = super.isKilled
        set(value) {}
    override val chanceNotGetDamage: Int
        get() = super.chanceNotGetDamage
    override fun attack(enemy: Warrior) {
        super.attack(enemy)
    }

    override fun takeDamage(quantityDamage: Int) {
        super.takeDamage(quantityDamage)
    }
}