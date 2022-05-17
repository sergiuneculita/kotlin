fun main() {
    val wheel1 = Wheel()
    val wheel2 = Wheel()
    wheel1.pumpUpTheWheel(8.0)
    wheel2.pumpUpTheWheel(2.1)
    wheel2.pumpUpTheWheel(8.4)
    wheel1.pumpUpTheWheel(-10.7)

}

class TooHighPressure : Throwable()
class TooLowPressure : Throwable()
class IncorrectPressure : Throwable()