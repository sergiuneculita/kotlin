class Captain(

) :AbstractWarrior() {
    override val maxHealth: Int = 75
    override val accuracy: Int = 35
    override val weapon: AbstractWeapon = Weapons.createM39()
    override var currentHealthPoint: Int = 75
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