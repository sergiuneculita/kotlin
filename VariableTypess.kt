fun main(){

    val firstName: String = "Sergiu"
    val lastName: String = "Neculita"
    var height: Double = 1.86


    var weight: Float = 89.1f

    var isChild: Boolean = height < 1.50 && weight < 40


    var info = """First name is $firstName ,
        | Last name is $lastName 
        |Sergiu Height - $height m
        |Sergiu Weight - $weight kg
        |Is Sergiu a Child ? - $isChild
    """.trimMargin()

    println(info)










}
