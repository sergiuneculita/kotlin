abstract class AbstractWarrior : Warrior {
    abstract val maxHealth: Int
    abstract val accuracy: Int
    abstract val weapon: AbstractWeapon
    abstract var currentHealthPoint: Int
    override val chanceNotGetDamage: Int = 0

    override var isKilled: Boolean = false


    override fun attack(enemy: Warrior) {
        val warrior = enemy
        if (weapon.isMagazineEmpty) {
            weapon.recharge()
        } else {
            weapon.getAmmoForShot().forEach {
                if (accuracy.probability() && !warrior.chanceNotGetDamage.probability()) {
                        warrior.takeDamage(it.takingCurrentDamage())

                }
            }
        }

    }

    override fun takeDamage(quantityDamage: Int) {
        if (currentHealthPoint > quantityDamage) currentHealthPoint -= quantityDamage
        else {currentHealthPoint = 0
        isKilled = true}
    }


}