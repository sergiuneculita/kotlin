fun main() {
    val dog = Dog(name = "Dog", energy = 6, weight = 4, maxAge = 9)


    fun animalInfo(animals: NatureReserve) {
        for (animal in animals.animalList){
        println("Animal name is ${animal.name}, Age: ${animal.currentAge}, maximal age: ${animal.maxAge}")
        println("Weight: ${animal.weight}, energy: ${animal.energy}")
    }}

    NatureReserve().animalLife(2)
    animalInfo(NatureReserve())
    dog.moving
    dog.multiply()


}