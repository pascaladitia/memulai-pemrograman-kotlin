// main function
fun main() {
    val length = massageLength("Hello pascal")
    println("Massage Length $length")
}

val massageLength = {
    massage: String -> massage.length
}
