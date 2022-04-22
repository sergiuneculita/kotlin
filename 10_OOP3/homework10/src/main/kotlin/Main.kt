fun main() {

val dollarConverter = Converters.get("eur")
  val euroConverter = Converters.get("usd")
   val mdLeuConverter = Converters.get("mdl")  // rate = 4.51

  /*  dollarConverter.convertToRub()
    euroConverter.convertToRub()
    mdLeuConverter.convertToRub()*/

 val convertteer : CurrencyConverter = DollarConverter()
 val doll : DollarConverter? = convertteer as? DollarConverter
 doll?.convertToRub()
}