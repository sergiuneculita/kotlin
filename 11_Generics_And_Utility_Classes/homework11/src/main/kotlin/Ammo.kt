enum class Ammo(
   name: String,
  val damage: Int,
   val criticalChanceDamage: Int,
    val criticalDamageRatio: Double
) {
    pistolCartrige("pistol_ammo",20, 12, 1.2),
    sniperCartrige("sniper_ammo",85, 90, 1.4),
    assaultCartrige("assault_ammo",70, 40, 1.5);


    fun takingCurrentDamage(): Int {
        return if (criticalChanceDamage.probability())
            damage * criticalDamageRatio.toInt()
        else damage
    }

}
