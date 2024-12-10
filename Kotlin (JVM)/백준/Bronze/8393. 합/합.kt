import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var sum = 0
    for (i in 1..n) {
        sum += i
    }
    println(sum)
}