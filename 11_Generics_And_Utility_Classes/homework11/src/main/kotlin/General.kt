class General(
    override val maxHealth: Int = 100,
    override val accuracy: Int = 50,
    override val weapon: AbstractWeapon = Weapons.createPistol(),
    override var currentHealthPoint: Int = 100
) : AbstractWarrior (){

}