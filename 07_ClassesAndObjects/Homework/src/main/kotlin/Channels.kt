import kotlin.random.Random

object Channels {
    internal var channels = mapOf(
        1 to "Ria1",
        2 to "RiaRoma",
        3 to "TVR1",
        4 to "TVR2",
        5 to "ProTV",
        6 to "ProTVint",
        7 to "Tv8",
        8 to "Tv6",
        9 to "JurnalTv",
        10 to "NorocTv"
    )

}

fun getRandomChannels(): Map<Int, String> {
    val key = Channels.channels.keys.toList()
    val mixValue = Channels.channels.values.shuffled()
    val channelsSize = Random.nextInt(1, 9)
    val newMap = mutableMapOf<Int, String>()
    for (i in 0..channelsSize) {
        val pair = Pair(key[i], mixValue[i])
        pair.second.also { newMap[pair.first] = it }
    }
    return newMap
}