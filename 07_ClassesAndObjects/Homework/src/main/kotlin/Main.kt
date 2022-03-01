fun main() {
    val samsung = TV("samsung", "PH-2300", 66)
    val philips = TV("philips", "dot-2.0", 55)
    val lg = TV("LG", "g500", 45)
    val upChannel = true
    val downChannel = false
    fun tvInfo(TV: TV) {
        println("The TV name is: ${TV.brand} ${TV.model}")
        println("Diagonal: ${TV.diagonal}")
        println("Channel list is: ${TV.chanelList}")
        println("Active channel is: ${TV.channelActive}")
        println("The TV volume is: ${TV.currentVolume}")
    }
    tvInfo(samsung)
    samsung.chanelSwitch
    println(samsung.channelActive)
    println("Switch up")
    samsung.channelUpDown(upChannel)
    println("Switch down")
    samsung.channelUpDown(downChannel)
    println("Switch up")
    samsung.channelUpDown(upChannel)
    println(samsung.channelActive)
    tvInfo(philips)
    philips.volumeUp(12)
    philips.volumeDown(30)
    philips.volumeUp(49)
    Thread.sleep(5000)
    println(philips.currentVolume)
    tvInfo(lg)
    lg.channelUpDown(upChannel)
    lg.channelUpDown(upChannel)
    lg.channelUpDown(upChannel)
    lg.channelUpDown(upChannel)
    println("current Channel ist ${lg.channelActive}")
}







