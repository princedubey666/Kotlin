// In this program, a mutable list of Long is created.
// The user is asked whether to remove the last number from the list,
// and then the sum of all elements is calculated.

fun main() {

    for (i in 1..5) {
        print("$i ")
    }

    println()

    for (i in 1 until 5) {
        print("$i ")
    }

    println()
    println("How many numbers do you want to enter: ")

    val a = readln().toIntOrNull() ?: 0
    val numbs = mutableListOf<Long>()

    var j = 0
    var sum: Long = 0

    while (j < a) {
        println("Enter number #${j + 1}")
        val number = readln().toLongOrNull() ?: continue

        numbs += number        // Adds a number to the list
        sum += number
        j++
    }

    println("Do you want to remove last number (yes or no): ")
    val p = readln()

    if (p == "yes") {
        sum -= numbs.last()
        numbs.remove(numbs.last())
        println("Last element removed successfully")
    }

    for (i in numbs) {
        print("$i ")
    }

    println()
    println("And the sum is $sum")
}
