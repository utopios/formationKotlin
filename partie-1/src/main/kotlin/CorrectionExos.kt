fun convert(n: Int): String {
    return when {
        (n%3 == 0) -> "Pling"
        (n%5 == 0) -> "plang"
        (n%7 == 0) -> "plong"
        else -> "$n"
    }
}
fun numberVerifier(str: String): String {
    return "0" + (str.filter { it.isDigit() }).takeLast(9)
}
fun kata() {
    val quarter = ('A'..'Z').map{
        "${" ".repeat('Z'-it)}$it${" ".repeat(it-'A')}"
    }
    val half = quarter.map {"$it${it.dropLast(1).reversed()}"}
    val all = half + half.dropLast(1).reversed()
    println(all.joinToString("\n"))
}
fun main() {
    println(numberVerifier("+337-68.54/09_87"))
}