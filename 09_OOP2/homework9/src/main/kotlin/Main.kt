fun main() {

    val visaCard = CreditCard(1000)
val dbDebitCard = DebitCard()
  /*visaCard.getInfoAvailableFounds()
   visaCard.addFunds()

    visaCard.pay()*/
    dbDebitCard.getInfoAvailableFounds()
    dbDebitCard.addFunds()
    dbDebitCard.pay()

}