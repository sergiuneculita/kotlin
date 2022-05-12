interface Warrior {
    var isKilled: Boolean
    val chanceNotGetDamage: Int
    fun attack(enemy: Warrior)
    fun takeDamage(quantityDamage: Int) {}
}