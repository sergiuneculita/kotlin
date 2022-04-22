enum class Ammo(
   name: String,
  val damage: Double,
   val criticalChanceDamage: Int,
    val criticalDamageRatio: Double
) {
    pistolCartrige("pistol_ammo",20.0, 12, 1.2),
    sniperCartrige("sniper_ammo",85.0, 90, 1.4),
    assaultCartrige("assault_ammo",70.0, 40, 1.5);


    fun takingCurrentDamage(): Double {
        return if (criticalChanceDamage.probability())
            damage * criticalDamageRatio
        else damage
    }

}
