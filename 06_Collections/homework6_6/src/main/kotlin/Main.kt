fun main() {
    println("How many phone numbers do you want to add?")
    var n = readLine()?.toIntOrNull() ?: return
    while (n <= 0) {
        println("The number must be greater than zero, please enter again  ")
        (readLine()?.toIntOrNull() ?: return).also { n = it }
    }
    println("Please add $n phone numbers")
    val phonesList = phonesList(n)

    println("The list o entered phone numbers is $phonesList")
    val correctFormat = phonesList.filter { it.startsWith("+7") }
    println("Number with prefix +7 are: $correctFormat")
    val uniqueNumber = correctFormat.toSet()
    println("The Quantity of correct phone numbers is ${uniqueNumber.size}")
    val lengthNumber = phonesList.sumOf { it.length }
    println("The length all symbols in the phone numbers list is $lengthNumber")

    phoneBook(phonesList)

}

fun phonesList(n: Int): MutableList<String> {
    val phoneNumbersList = mutableListOf<String>()
    for (i in 1..n) {
        phoneNumbersList.add((readLine().toString()))
    }
    return phoneNumbersList
}

fun phoneBook(list: MutableList<String>): MutableMap<String, String> {
    val pBook = mutableMapOf<String, String>()
    val uniqueNumbers = list.filter { it.startsWith("+7") }
    uniqueNumbers.toSet().forEach {
        println("Enter the name of this phone number $it: ")
        val name = readLine().toString()
        pBook[it] = name
    }
    println("Phone numbers added  are:")

    pBook.forEach { entries ->

        println(" Name: ${entries.value} Number: ${entries.key}")

    }
    println("Phone book sorted by name is:")
    pBook.toList().sortedBy { it.second }.forEach { println(it) }
    println("Phone book sorted by number is:")
    pBook.toList().sortedBy { it.first }.forEach { println(it) }
    return pBook

}

