object Converters {
    private val converters = listOf(DollarConverter(), EuroConverter())
      private lateinit var thisConverter: CurrencyConverter

    fun get(currencyCode: String): CurrencyConverter {
        converters.forEach {
            if ( currencyCode.uppercase() == it.currencyCode ) {

               thisConverter = it
                return thisConverter
            } else {
                thisConverter = object : CurrencyConverter {
                    override val currencyCode: String = currencyCode
                    override fun convertToRub() {
                        val resultcurrency: Double
                        println("How many rubles you want to exchange to ${this.currencyCode}")
                        val nRub = readLine()?.toIntOrNull()
                        if (nRub != null) {
                            if (nRub > 0) {
                                resultcurrency = (nRub % (getExchangeRate(this.currencyCode)))
                                println("$nRub Rub = $resultcurrency ${this.currencyCode}")
                            } else {
                                println("You entered a negative amount")
                                convertToRub()
                            }

                        }else{println("You must enter numbers")
                            convertToRub()}

                    }

                }
            }
        }
        return thisConverter
    }

   private fun getExchangeRate(currency: String): Double {
        println("Please enter the rate for the $currency ")
        var nRate = readLine()?.toDoubleOrNull()
        if (nRate != null) {
            return nRate
        } else {
            nRate = 0.00
            println("You must enter the exchange rate in the format 0.00")
            getExchangeRate(currency)
        }
        return nRate
    }

}

