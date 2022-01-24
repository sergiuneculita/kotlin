

fun main() {
    val text = "F2p)v\"y233{0->c}ttelciFc"
    //println(text.count()) // control sum
    val text1 = text.take(12)  //"""F2p)v"y233{0"""
    //println(text1) //control first part
     val text2 = text.takeLast(12)

    val textComplet = decodeText1(text1)+decodeText2(text2)
    print(textComplet)




}

fun decodeText1(firstPart : String): String {
    val decode2_5 = shift(firstPart, {it + 1})//firstPart.map { char -> char + 1 }.joinToString("")

    val decode2_4 = decode2_5.replace('5', 's')
    val decode2_3 =decode2_4.replace(oldChar = '4', newChar = 'u')
    val decode2_2 = shift(decode2_3, {it - 3})
    val decode2_1 = decode2_2.replace(newChar = 'o', oldChar =  '0' )


    return decode2_1


}
fun decodeText2(secondPart : String): String {
    val decode3_3 = secondPart.reversed()
    val decode3_2 = shift(decode3_3, {it - 4})
    val decode3_1 = decode3_2.replace(oldChar = '_', newChar = ' ')
    return decode3_1

}
fun shift(str: String, func: (Char) -> Char ): String {

    return  str.map(func).joinToString("")



}







