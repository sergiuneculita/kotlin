import Firetype.*

object Weapons {



    fun createSniperWeapon(): AbstractWeapon {
        return object : AbstractWeapon(
            32, AutomaticFire(8)
        ) {
            override fun createAmmoForWeapon(): Ammo {
                return Ammo.sniperCartrige
            }
        }
    }
    fun createPistol(): AbstractWeapon {
        return object : AbstractWeapon(8,SingleShot){
            override fun createAmmoForWeapon(): Ammo {
                return Ammo.pistolCartrige
            }

        }
    }
    fun createAk47():AbstractWeapon{
        return object  : AbstractWeapon(30,Firetype.AutomaticFire(10)){
            override fun createAmmoForWeapon(): Ammo {
               return Ammo.assaultCartrige
            }
        }

    }

}
