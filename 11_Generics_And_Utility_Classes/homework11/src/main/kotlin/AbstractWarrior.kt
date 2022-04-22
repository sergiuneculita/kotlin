abstract class AbstractWarrior : Warrior {
    abstract val maxHealth: Int
    abstract val accuracy: Int
    abstract val weapon: AbstractWeapon
    abstract val currentHealthPoint: Int
    override val chanceNotGetDamage: Int
        get() = TODO("Not yet implemented")
    override val isKilled: Boolean
        get() = TODO("Not yet implemented")
    override fun attack(enemy: Warrior) {
        



    }



}