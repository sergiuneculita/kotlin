class EuroConverter : CurrencyConverter {
    override val currencyCode = "EUR"
    private val exchangeRate = 91.47
    override fun convertToRub() {
        println("How many rubles you want to exchange to $currencyCode")
        val nRub = readLine()?.toIntOrNull()
        if (nRub != null) getResultCurrency(nRub)
        else {
            println("You must enter numbers")
            convertToRub()
        }


    }

    private fun getResultCurrency(nRub: Int) {
        val resultCurrency: Double
        if (nRub > 0) {
            resultCurrency = nRub / exchangeRate
            println("$nRub Rub = $resultCurrency $currencyCode")
        } else {
            println("You entered a negative amount")
            convertToRub()
        }

    }
}