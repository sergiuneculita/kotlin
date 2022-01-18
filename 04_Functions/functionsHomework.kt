fun main() {
    val text = "F2p)v\"y233{0->c}ttelciFc"
    //println(text.count()) // control sum
    val text1 = text.take(12)  //"""F2p)v"y233{0"""
    //println(text1) //control first part
     val text2 = text.takeLast(12)
    print(decodeText1(text1) + decodeText2(text2))
    //println(text.map {(Char) -> text })
}
fun decodeText1(text1 : String): String {
    val decode2_5 = text1.map { char -> char + 1 }.joinToString("")
    val decode2_4 = decode2_5.replace('5', 's')
    val decode2_3 =decode2_4.replace(oldChar = '4', newChar = 'u')
    val decode2_2 = decode2_3.map { char -> char - 3 }.joinToString("")
    val decode2_1 = decode2_2.replace(newChar = 'o', oldChar =  '0' )
    return decode2_1
}
fun decodeText2(text2 : String): String {
    val decode3_3 = text2.reversed()
    val decode3_2 = decode3_3.map { char -> char - 4 }.joinToString("")
    val decode3_1 = decode3_2.replace(oldChar = '_', newChar = ' ')
    return decode3_1
}
//fun shiftSymbol(text : String , printinfo: ): String {

    //val schift1 = decodeText1() }