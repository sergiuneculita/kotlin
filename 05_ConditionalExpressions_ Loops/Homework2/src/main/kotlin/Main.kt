fun main(){
    Check() }
fun Check(){
    println(" Enter the number: ")
    val n: Long = readLine()?.toLongOrNull()?:return
    return if (n <= 0){
        println("The number is not part of the Fibonacci sequence")
        Check()
    }else{calculate(n)
        Check()} }
fun calculate(n: Long){
    var i: Long = 0
    var fibSum = 0
    var fib1 = 0
    var fib2 = 1
    while (i < n - 2){
        fibSum = fib1 + fib2
        fib1 = fib2
        fib2 = fibSum
        i++ }
    println("The Fibonacci number is $fibSum" )
    return
}
