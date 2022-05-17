class TV(val brand: String, val model: String, val diagonal: Int) {
    init {
        getRandomChannels()
    }

    var isOn = false
        get() = field

     fun switchOnOff(isTvOn: Boolean) {
        isOn = isTvOn
        if (isOn) println(" Switched On")
        else println("  Switched Off")
    }

    private val chanelList = getRandomChannels().toMap()

    var channelActive = chanelList.entries.first().toPair()

    private val currentChannel: Pair<Int, String>
        get() {
            println("Please enter channel")
            return chanelSwitch1()
        }

    private fun chanelSwitch1(chanel: Int? = readLine()?.toIntOrNull()): Pair<Int, String> {
        var saveChannel = channelActive
        if (isOn) {
            switchOnOff(isOn)
            currentChannel
        } else if (chanel != 0) {
            if (chanel != null)
                if (chanel <= chanelList.size) {
                    chanelList.entries.forEach { entry ->
                        if (entry.key == chanel) {
                            channelActive = entry.toPair()
                            println("you switched channel ${channelActive.first}-${channelActive.second}")
                            saveChannel = channelActive
                        }
                    }
                } else {
                    println("Chanel Don't found Please enter channel from your list")
                    currentChannel
                }
        }

        return saveChannel
    }

    fun channelUpDown(direction: Boolean) {
        val currentChannel = channelActive.first
        if (isOn) {
            switchOnOff(isOn)
            channelUpDown(direction)
        } else {
            val upDown = if (direction) 1 else -1
           val nextChannel = if (currentChannel + upDown > chanelList.size) 1
            else if (currentChannel + upDown < 1) chanelList.size
            else currentChannel + upDown
            chanelSwitch1(nextChannel)
        }

    }


    var currentVolume = 0
    fun volumeUp(volume: Int) {
        currentVolume += volume
        if (currentVolume <= maxVolume) println("Changed the volume to $currentVolume") else {
            println("Maximum volume ist 100")
            currentVolume = maxVolume
        }
    }

    fun volumeDown(volume: Int) {
        currentVolume -= volume
        if (currentVolume >= 0) println("Changed the volume to $currentVolume") else {
            println("Mute")
            currentVolume = 0
        }
    }

    companion object {
        const val maxVolume = 100

    }
}