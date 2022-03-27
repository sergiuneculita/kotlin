
class DBCreditCard(creditLimit: Int= 10000,private val percentPayBack: Double = 0.05,private val percentBonAdd: Double = 0.005) :
    CreditCard(creditLimit) {

   private var bonusPoints = 0.000
    get() {return field}
   private var payBack = 0.000
    get() {return field}
   private var bonusAddFunds = 0.000
    get() {return field}
    override var checkAddFund: Boolean = super.checkAddFund

    override var checkPay: Boolean = super.checkPay
        get() {return field}
    override var balance: Int = super.balance
        get() {return field}
    override var creditBalance: Int = super.creditBalance
      get() {return field}


   override fun getInfoAvailableFounds() {
        super.getInfoAvailableFounds()
        println("Total  addBonus $bonusAddFunds")
        println("Total PayBack $payBack")
        println("Total $bonusPoints  Points")
       // println("Credit limit $creditLimit")
    }

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
                bonusAddFunds += (addedFunds * percentBonAdd)
                println("After you have added the amount of $addedFunds$")
                println("You received a ${(addedFunds * percentBonAdd)}$ bonus")
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
        checkPay= false
        println(" How much money you want to pay? :")
        val payFunds = readLine()?.toIntOrNull()
        if (payFunds != null) {
            if (payFunds <= balance) {
                balance -= payFunds
                if (payFunds > 5000) {
                    payBack += (payFunds * percentPayBack)
                    bonusPoints += 1
                }
                println("After you paid the amount of $payFunds$")
                println("You recived ${payFunds * percentPayBack} PayBack")

                println("You recived 1 bonus point")
                getInfoAvailableFounds()

                checkPay = true
            } else {
                if (payFunds <= (creditBalance + balance)) {
                    creditBalance = (creditBalance - (payFunds - balance))
                    balance = 0
                    if (payFunds > 5000) {
                        payBack += (payFunds * percentPayBack)
                        bonusPoints += 1
                    }
                    println("After you paid the amount of $payFunds$")
                    println("You recived ${payFunds * percentPayBack} PayBack")

                    println("You recived 1 bonus point")
                    getInfoAvailableFounds()

                    checkPay = true
                } else {
                    println("You don't have that much money for this payment")
                    println("Transaction failed")
                    pay()
                }
            }
        }else{  println("entered value must be number")
        pay()}

        return checkPay
    }
}



