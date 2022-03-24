open class CreditCard(var creditLimit: Int) : BankCard() {


    override var balance: Int = super.balance

    var creditBalance = creditLimit

    override fun addFunds(): Boolean {
        var check = false
        if (creditBalance == creditLimit) {
            return super.addFunds()
        } else {

            println(" How much money you want to add to the card? :")
            val addedFunds = readLine()?.toIntOrNull()
            if (addedFunds != null) {
                if (addedFunds > 0) {
                    if (addedFunds <= creditLimit - creditBalance) {
                        creditBalance += addedFunds

                    } else {
                        balance = addedFunds - (creditLimit - creditBalance)
                        creditBalance += creditLimit

                    }
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
        }
        return check
    }

    override fun pay(): Boolean {
        var check = false
        println(" How much money you want to pay? :")
        val payFunds = readLine()?.toIntOrNull()

        if (payFunds != null) {
            if (payFunds >= balance) {
                if (payFunds <= (creditBalance + balance)) {
                    creditBalance = creditBalance - (payFunds - balance)
                    balance = 0
                    println("After you paid the amount of $payFunds$")
                    getInfoAvailableFounds()
                    check = true
                } else {
                    println("You don't have that much money for this payment")
                    println("Transaction failed")
                    pay()
                }
            } else {
                super.pay()
               /* println("After you paid the amount of $payFunds$")
                getInfoAvailableFounds()*/
            }
        }
        return check
    }

    override fun getInfoAvailableFounds() {
        super.getInfoAvailableFounds()
        println("You have $creditBalance$ of credit funds")
        println("you credit card has a limit of $creditLimit")
    }
}

