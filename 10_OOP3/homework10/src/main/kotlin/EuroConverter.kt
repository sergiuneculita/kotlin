open class EuroConverter : CurrencyConverter {
    override val currencyCode = "EUR"
  private  val exchangeRate = 91.47
    override fun convertToRub() {
        val resultcurrency: Double
        println("How many rubles you want to exchange to $currencyCode")
        val nRub = readLine()?.toIntOrNull()
        if (nRub != null) {
            if (nRub > 0) {
                resultcurrency = (nRub / exchangeRate)
                println("$nRub Rub = $resultcurrency $currencyCode")
            }else{
                println("You entered a negative amount")
                convertToRub()
            }

        }else{println("You must enter numbers")
            convertToRub()}

    }
}