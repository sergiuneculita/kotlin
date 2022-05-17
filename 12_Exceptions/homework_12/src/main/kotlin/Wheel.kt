class Wheel {
    private var currentPressure = 0.0

    fun pumpUpTheWheel(pumpedUpPressure: Double) {
        currentPressure += pumpedUpPressure
        val exception = runCatching { checkPressure() }
        println("After pumping $pumpedUpPressure atmospheres")
        if (exception.isFailure) {
            when (exception.exceptionOrNull()) {
                is IncorrectPressure -> {
                    println(" The procedure failed.")
                }
                is TooHighPressure -> {
                    println("It cannot be exploited - too high pressure")
                }
                is TooLowPressure -> {
                    println("It cannot be exploited - too low pressure")
                }
            }
        } else {
            println(" the procedure was successful.")

        }
    }

    private fun checkPressure() {

        when {
            currentPressure <= 0 -> {
                throw  IncorrectPressure()
            }
            currentPressure >= 10 -> {
                throw IncorrectPressure()
            }

            currentPressure > 2.5 -> {

                throw TooHighPressure()
            }
            currentPressure < 1.6 -> {

                throw TooLowPressure()
            }


        }


    }
}