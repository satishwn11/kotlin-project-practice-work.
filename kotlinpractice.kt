//4. Find remainder without using `%` operator. : handle zero & negative numbers.
fun main() {
    val no1 = 0
    val no2 = -6

    var i = no2
    if(no1 != 0 && no2 != 0) {
           while(i >= no1) {
        i = i - no1
    }
    }
    if(no2 == i) {
        println("This operation not allowed")
    } else {
        println("reminder: $i")
    }
}