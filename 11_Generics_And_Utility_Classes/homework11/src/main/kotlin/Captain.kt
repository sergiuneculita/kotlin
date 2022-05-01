class Captain(
    override val maxHealth: Int = 75,
    override val accuracy: Int = 35,
    override val weapon: AbstractWeapon = Weapons.createM39(),
    override var currentHealthPoint: Int = 75
) :AbstractWarrior() {
}