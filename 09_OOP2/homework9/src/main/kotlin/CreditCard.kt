abstract class CreditCard(val creditLimit: Int) : BankCard() {


    override var balance: Int = super.balance
    open var creditBalance = creditLimit

    override fun addFunds(): Boolean {
        checkAddFund = false
        println(" How much money you want to add to the card? :")
        val addedFunds = readLine()?.toIntOrNull()
        if (addedFunds != null) {
            if (addedFunds > 0) {
                if (creditBalance == creditLimit) {
                    balance += addedFunds
                } else {
                    if (addedFunds <= (creditLimit - creditBalance)) {
                        creditBalance += addedFunds

                    } else {
                        balance += (addedFunds - (creditLimit - creditBalance))
                        creditBalance = creditLimit
                    }
                }
                println("After you have added the amount of $addedFunds$")
                getInfoAvailableFounds()
                checkAddFund = true
            } else {
                println("The number must be greater than 0")

                addFunds()
            }
        } else {
            println("entered value must be number")

            addFunds()
        }
        return checkAddFund
    }
    override fun pay(): Boolean {
        println(" How much money you want to pay? :")
        val payFunds = readLine()?.toIntOrNull()

        if (payFunds != null) {
            if (payFunds >= balance) {
                if (payFunds <= (creditBalance + balance)) {
                    creditBalance = (creditBalance - (payFunds - balance))
                    balance = 0
                    println("After you paid the amount of $payFunds$")
                    getInfoAvailableFounds()
                    checkPay = true
                } else {
                    println("You don't have that much money for this payment")
                    println("Transaction failed")
                    checkPay = false
                    pay()
                }
            } else {
                super.pay()
                checkPay = true
            }
        }
        return checkPay
    }

    override fun getInfoAvailableFounds() {
        super.getInfoAvailableFounds()
        println("You have $creditBalance$ of credit funds")
    }

}

