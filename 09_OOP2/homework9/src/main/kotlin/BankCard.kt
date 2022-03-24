abstract class BankCard() {
    open var balance = 0

    open fun addFunds(): Boolean {
        var check = false
        var newBalance = balance
        println(" How much money you want to add to the card? :")
        val addedFunds = readLine()?.toIntOrNull()
        if (addedFunds != null) {
            if (addedFunds > 0) {
                newBalance += addedFunds
                balance = newBalance
                println("After you have added the amount of $addedFunds$")
                getInfoAvailableFounds()
                check = true
            } else {
                println("The number must be greater than 0")
                addFunds()
            }
        } else {
            println("entered value must be number")
            addFunds()
        }
        return check
    }

    open fun pay(): Boolean {
        var check = false
        var newBalance = balance
        println(" How much money you want to pay? :")
        val payFunds = readLine()?.toIntOrNull()
        if (payFunds != null) {
            if (payFunds <= balance) {
                newBalance -= payFunds
                balance = newBalance
                println("After you paid the amount of $payFunds$")
                getInfoAvailableFounds()
                check = true
            } else {
                println("Amount must be greater than $balance")
                println("Transaction failed")
                pay()
            }
        } else {
            println("entered value must be number")
            pay()
        }
        return check
    }

    open fun getInfoBalance() {
        println("You have $balance$ of personal funds")
    }

    open fun getInfoAvailableFounds() {
        getInfoBalance()
    }


}

