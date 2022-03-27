fun main() {

val deutcheBankCreditKArte = DBCreditCard(20000)
    val deutcheBankDebitKarte = DBDebitCard(0.03,0.002)
    deutcheBankCreditKArte.pay()
    deutcheBankCreditKArte.pay()
    deutcheBankCreditKArte.addFunds()
    deutcheBankCreditKArte.addFunds()
    deutcheBankDebitKarte.pay()
    deutcheBankDebitKarte.addFunds()
    deutcheBankDebitKarte.pay()










}