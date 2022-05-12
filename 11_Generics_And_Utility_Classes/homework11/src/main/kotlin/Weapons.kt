import Firetype.*

object Weapons {


  /*  fun createSniperWeapon(): AbstractWeapon {
        return object : AbstractWeapon(
            15, SingleShot
        ) {
            override fun createAmmoForWeapon(): Ammo {
                return Ammo.sniperCartrige
            }
        }
    }
   */

    fun createPistol(): AbstractWeapon {
        return object : AbstractWeapon(8, SingleShot) {
            override fun createAmmoForWeapon(): Ammo {
                return Ammo.pistolAmmo
            }

        }
    }

    fun createAk47(): AbstractWeapon {
        return object : AbstractWeapon(30, Firetype.AutomaticFire(10)) {
            override fun createAmmoForWeapon(): Ammo {
                return Ammo.assaultAmmo
            }
        }

    }

    fun createM39(): AbstractWeapon {
        return object : AbstractWeapon(34, Firetype.AutomaticFire(12)) {
            override fun createAmmoForWeapon(): Ammo {
                return Ammo.assaultAmmo
            }
        }
    }

}
