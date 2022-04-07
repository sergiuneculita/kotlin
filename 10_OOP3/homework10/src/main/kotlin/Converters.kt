object Converters {
    private val converters = listOf( DollarConverter(),EuroConverter())

    fun get(currencyCode: String): CurrencyConverter {
        lateinit var newConverter: CurrencyConverter
        converters.forEach {
          newConverter = if (it.currencyCode == currencyCode.uppercase()) return it
            else createAbstractObject(currencyCode)
        }
        return newConverter
    }
    private fun createAbstractObject(currencyCode: String): CurrencyConverter {
        return object : CurrencyConverter {
            override val currencyCode: String = currencyCode.uppercase()
            override fun convertToRub() {
                convertToRubNewCurrency(this.currencyCode)
            }
        }
    }

   private fun convertToRubNewCurrency(newCurrencyCode: String) {
        println("How many rubles you want to exchange to $newCurrencyCode")
        val nRub = readLine()?.toIntOrNull()
        if (nRub != null) {
            getResultNewCurrency(nRub, newCurrencyCode)
        } else {
            println("You must enter numbers")
            convertToRubNewCurrency(newCurrencyCode)
        }

    }


    private fun getResultNewCurrency(nRub: Int, newCurrencyCode: String) {
        val resultCurrency: Double
        if (nRub > 0) {
            resultCurrency = (nRub / (getExchangeRate(newCurrencyCode)))
            println("$nRub Rub = $resultCurrency $newCurrencyCode")
        } else {
            println("You entered a negative amount")
            convertToRubNewCurrency(newCurrencyCode)
        }
    }

    private fun getExchangeRate(currency: String): Double {
        println("Please enter the rate for the $currency ")
        val nRate = readLine()?.toDoubleOrNull()
        return if (nRate != null) nRate else {
            println("You must enter the exchange rate in the format 0.00")
            getExchangeRate(currency)
        }

    }


}


