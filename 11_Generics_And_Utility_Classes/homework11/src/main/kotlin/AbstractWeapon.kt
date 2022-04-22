

abstract class AbstractWeapon(
    val maxAmmoMagazine: Int,
    val fireType: Firetype,
    var weaponMagazine: Stack<Ammo> = Stack()


) {
    open val isMagazineEmpty: Boolean
        get() = weaponMagazine.list.size > 0


    abstract fun createAmmoForWeapon(): Ammo


    open fun recharge(): Stack<Ammo> {
        val newMagazine: Stack<Ammo> = Stack()
        for (i in 0 until maxAmmoMagazine) {
            newMagazine.push(createAmmoForWeapon())
        }
        weaponMagazine = newMagazine
        return weaponMagazine
    }

    fun getAmmoForShot(): List<Ammo> {
        val ammoList = mutableListOf<Ammo>()
        val ammoCount: Int = when (fireType) {
            is Firetype.SingleShot -> 1
            is Firetype.AutomaticFire -> fireType.fireSize
        }
        println(" get $ammoCount Ammo")
            for (i in 0 until ammoCount) {
                ammoList.add(weaponMagazine.pop() ?: break)

            }

        return ammoList


    }
}