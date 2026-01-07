// Extension function that filters characters from a string
// based on a predicate lambda
fun String.Fil(predicate: Char.() -> Boolean): String {
    return buildString {
        for (char in this@Fil) {
            if (char.predicate()) {
                append(char)
            }
        }
    }
}

// Function that demonstrates using the standard library `map`
// with a lambda to square each integer in a list
fun map() {
    val a = listOf(1,2,3,4,5,6,7,8,9,10)
    val n = a.map { it * it }   // lambda that maps each number to its square
    println(n)
}

// Main function to demonstrate the usage of the above functions
fun main() {
    println("Enter a string:")
    val input = readln()

    // Uses a lambda predicate to keep only letters in the string
    val out = input.Fil {
        isLetter()
    }

    println(out)
    map()
}
