import kotlin.random.Random

fun main(){
    val stack = Weapons.createSniperWeapon().weaponMagazine
    val sniper = Weapons.createSniperWeapon()
    /*println( sniper.fireType)
    println(sniper.weaponMagazine.list.size)
        println(sniper.isMagazineEmpty)
            println( sniper.maxAmmoMagazine)
    println(sniper.createAmmoForWeapon().name)
    sniper.recharge()
    println(sniper.weaponMagazine.list.size)
    println(sniper.isMagazineEmpty)
    sniper.getAmmoForShot()
    println(sniper.weaponMagazine.list.size)

    sniper.getAmmoForShot()
    println(sniper.weaponMagazine.list.size)
    println(sniper.isMagazineEmpty)
    sniper.getAmmoForShot()
    println(sniper.weaponMagazine.list.size)
    println(sniper.isMagazineEmpty)
    sniper.getAmmoForShot()
    println(sniper.weaponMagazine.list.size)
    println(sniper.isMagazineEmpty)
    sniper.getAmmoForShot()
    println(sniper.weaponMagazine.list.size)
    println(sniper.isMagazineEmpty)*/
    val aK47 = Weapons.createAk47()
    println( aK47.fireType)
    println(aK47.weaponMagazine.list.size)
    println(aK47.isMagazineEmpty)
    println( aK47.maxAmmoMagazine)
    println(aK47.createAmmoForWeapon().name)
    aK47.recharge()
    println(aK47.weaponMagazine.list.size)
    println(aK47.isMagazineEmpty)
    aK47.getAmmoForShot()
    println(aK47.weaponMagazine.list.size)

    aK47.getAmmoForShot()
    println(aK47.weaponMagazine.list.size)
    println(aK47.isMagazineEmpty)
    aK47.getAmmoForShot()
    println(aK47.weaponMagazine.list.size)
    println(aK47.isMagazineEmpty)
    aK47.getAmmoForShot()
    println(aK47.weaponMagazine.list.size)
    println(aK47.isMagazineEmpty)
    aK47.getAmmoForShot()
    println(aK47.weaponMagazine.list.size)
    println(aK47.isMagazineEmpty)
}

fun Int.probability():Boolean{
    return this <= Random.nextInt(0,100)
}