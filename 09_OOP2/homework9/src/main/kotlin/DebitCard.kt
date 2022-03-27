abstract class DebitCard() : BankCard() {
    override var balance: Int = super.balance
    override var checkAddFund: Boolean = super.checkAddFund
    override var checkPay: Boolean = super.checkPay
    override fun getInfoAvailableFounds() {
        super.getInfoAvailableFounds()
    }
    override fun addFunds(): Boolean {
     return super.addFunds()
    }
    override fun pay(): Boolean {
      return super.pay()
    }

}