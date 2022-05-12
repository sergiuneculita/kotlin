abstract class AbstractWarrior : Warrior {
    abstract val maxHealth: Int
    abstract val accuracy: Int
    abstract val weapon: AbstractWeapon
    abstract var currentHealthPoint: Int
    abstract override val chanceNotGetDamage: Int
    abstract override var isKilled: Boolean


    override fun attack(enemy: Warrior) {
        val currentDamage = weapon.createAmmoForWeapon().takingCurrentDamage()
        val ammoForShot = weapon.getAmmoForShot()
        if (weapon.isMagazineEmpty) {
            weapon.recharge()
        } else {
            ammoForShot.forEach { _ ->
                val probabilityDamage = accuracy.probability() && !enemy.chanceNotGetDamage.probability()
                if (probabilityDamage) {
                    enemy.takeDamage(currentDamage)
                }

            }
        }
    }

    override fun takeDamage(quantityDamage: Int) {
        if (currentHealthPoint > quantityDamage) currentHealthPoint -= quantityDamage
        else {
            currentHealthPoint = 0
            isKilled = true
        }
    }


}