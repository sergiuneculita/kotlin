object Converters {
    private val converters = listOf(EuroConverter(), DollarConverter())
    private lateinit var thisConverter: CurrencyConverter

    fun get(currencyCode: String): CurrencyConverter {

        converters.forEach {
            when (currencyCode.uppercase()) {
                it.currencyCode -> {
                    thisConverter = it
                    return thisConverter
                }
                else -> thisConverter = object : CurrencyConverter {
                    override val currencyCode: String = currencyCode.uppercase()
                    override fun convertToRub() {
                        val resultCurrency: Double
                        println("How many rubles you want to exchange to ${this.currencyCode}")
                        val nRub = readLine()?.toIntOrNull()
                        when {
                            nRub != null -> when {
                                nRub > 0 -> {
                                    resultCurrency = (nRub % (getExchangeRate(this.currencyCode)))
                                    println("$nRub Rub = $resultCurrency ${this.currencyCode}")
                                }
                                else -> {
                                    println("You entered a negative amount")
                                    convertToRub()
                                }
                            }
                            else -> {
                                println("You must enter numbers")
                                convertToRub()
                            }
                        }

                    }

                }
            }
        }
        return thisConverter
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

