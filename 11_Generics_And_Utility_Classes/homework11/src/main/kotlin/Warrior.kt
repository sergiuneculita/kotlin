interface Warrior {
    val isKilled : Boolean
    val chanceNotGetDamage: Int
    fun attack(enemy: Warrior) {}
    fun takeDamage(quantityDamage: Int) {}
}