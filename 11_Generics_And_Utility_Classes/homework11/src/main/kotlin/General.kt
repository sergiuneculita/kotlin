class General(

) : AbstractWarrior (){
    override val maxHealth: Int = 100
    override val accuracy: Int = 50
    override val weapon: AbstractWeapon = Weapons.createPistol()
    override var currentHealthPoint: Int = 100
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