fun main(){
    val n = readLine()?.toIntOrNull()?:return
    if (n < 0) {
        fibona(n)
    }
    else{
        println(" no corect number $n ")

    }
    while (n < 0){}
}
fun fibona(num: Int){
