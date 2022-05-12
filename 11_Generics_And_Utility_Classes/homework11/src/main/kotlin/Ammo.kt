enum class Ammo(

    var damage: Int,
    val criticalChanceDamage: Int,
    val criticalDamageRatio: Int
) {
    pistolAmmo(12, 30, 3),

    //sniperAmmo("sniper_ammo",35, 80, 6),
    assaultAmmo(25, 40, 4);


    fun takingCurrentDamage(): Int {
        return if (criticalChanceDamage.probability())
            damage * criticalDamageRatio
        else damage

    }

}
