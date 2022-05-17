abstract class BankCard() {


    open var balance = 0
    open var checkAddFund = false
    open var checkPay = false
    open fun addFunds() : Boolean{
        checkAddFund = false
        println(" How  much money you want to add to the card? :")
        val addedFunds =  readLine()?.toIntOrNull()
        if (addedFunds != null) {
            if (addedFunds > 0) {
                balance += addedFunds
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
   open fun pay():Boolean{
       checkPay = false
       println(" How much money you want to pay? :")
       val payFunds = readLine()?.toIntOrNull()
       if (payFunds != null) {
           if (payFunds <= balance) {
               balance -= payFunds
               println("After you paid the amount of $payFunds$")
               getInfoAvailableFounds()
               checkPay = true
           } else {
               println("Amount must be greater than $balance")
               println("Transaction failed")

               pay()
           }
       } else {
           println("entered value must be number")

           pay()
       }
       return checkPay
   }
    open fun getInfoBalance() {
        println("You have $balance$ of personal funds")
    }
    open fun getInfoAvailableFounds() {
        getInfoBalance()
    }

}

