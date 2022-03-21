class NatureReserve() {
    var animalList = mutableListOf<Animals>(
        Dog("Jack", 4, 5, ),
        Dog("Ion", 6, 7, ),
        Bird("Marcel3", 8, 2, ),
        Bird("Marcel4", 7, 2, ),
        Bird("Marcel5", 8, 2, ),
        Bird("Marcel6", 5, 2, ),
        Bird("Marcel7", 8, 2, ),
        Fish("Neculasca8", 6, 3, ),
        Fish("Neculasca9", 4, 5, ),
        Fish("Neculasca10", 4, 4, ),
        Animals("Gosa", 4, 5 , 7)
    )

    fun animalLife(n: Int) {
        println(" There are ${animalList.size} animals in the reserve")
        for (i in 1..n) {
            if (animalList.size == 0) {
                println("no more animals in the reserve")
                return
            } else animalList.toList().forEach {
                when ((1..4).random()) {
                    1 -> it.sleep()
                    2 -> it.eat()
                    3 -> it.move()
                    4 -> {
                        animalList.add(it.multiply())
                    }
                }
                if (it.currentAge >= it.maxAge) {
                    animalList.remove(it)
                    println("${it.name} dead")
                }

            }
            println(" ${animalList.size} animals survived")
        }


    }
}










