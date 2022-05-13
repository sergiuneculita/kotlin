enum class Ammo(

    var damage: Int,
    val criticalChanceDamage: Int,
    val criticalDamageRatio: Int
) {
    PISTOLAMMO(12, 30, 3),
    ASSAULTAMMO(25, 40, 4);

    fun takingCurrentDamage(): Int {
        return if (criticalChanceDamage.probability())
            damage * criticalDamageRatio
        else damage

    }

}
