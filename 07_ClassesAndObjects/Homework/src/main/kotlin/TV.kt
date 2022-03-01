class TV(val brand: String, val model: String, val diagonal: Int) {
    init {
        getRandomChannels()
    }

    private var isOn = false

    private fun onOrOff() = if (isOn) {
        isOn = true
        println("On")
    } else {
        println("Off")
    }

    internal val chanelList = getRandomChannels().toMap()
    var channelActive = chanelList.entries.first().toPair()

    val chanelSwitch: Pair<Int, String>
        get() {
            println("Please enter channel")
            return chanelSwitch1()
        }

    private fun chanelSwitch1(chanel: Int? = readLine()?.toIntOrNull()): Pair<Int, String> {
        var saveChannel = channelActive
        if (isOn) {
            onOrOff()
            chanelSwitch
        } else if (chanel != 0) {
            if (chanel!! <= chanelList.size) {
                chanelList.entries.forEach { entry ->
                    if (entry.key == chanel) {
                        channelActive = entry.toPair()
                        println("you switched channel ${channelActive.first}-${channelActive.second}")
                        saveChannel = channelActive
                    }
                }
            } else {
                println("Chanel Don't found Please enter channel from your list")
                chanelSwitch
            }
        }

        return saveChannel
    }

    fun channelUpDown(direction: Boolean) {
        val currentChannel = channelActive.first
        if (isOn) {
            onOrOff()
            channelUpDown(direction)
        } else {
            val upDown = if (direction) 1 else -1
            (if (currentChannel + upDown > chanelList.size) 1
            else if (currentChannel + upDown < 1) chanelList.size
            else currentChannel + upDown).also {
                chanelSwitch1(it)
            }

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
        internal const val maxVolume = 100
    }
}
