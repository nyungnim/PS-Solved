import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    
    when {
        a > b -> println(">")
        a < b -> println("<")
        else -> println("==")
    }
}