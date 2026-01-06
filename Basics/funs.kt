fun main() {

    // ---------- String Palindrome Check ----------

    // Ask the user to enter a string
    print("Enter a string: ")
    val inputString = readln()

    // Reverse the string using the extension function
    val reversedString = inputString.reversed()

    // Display the reversed string
    println("Reversing the string is: $reversedString")

    // Check if the string is a palindrome
    if (inputString == reversedString) {
        println("It is a palindrome!")
    } else {
        println("It is not a palindrome!")
    }

    // Concatenate the original string and its reversed version
    val combinedString = inputString + reversedString
    println("Adding the string and its reversed string is: $combinedString")


    // ---------- Long Palindrome Check & Average Calculation ----------

    // Ask the user to enter an integer
    print("Enter an integer: ")
    val number = readln().toLongOrNull() ?: 0

    // Reverse the Long value using the overloaded extension function
    val reversedNumber = number.reversed()

    // Display the reversed number
    println("Reversing the integer is: $reversedNumber")

    // Check if the number is a palindrome
    if (number == reversedNumber) {
        println("It is a palindrome!")
    } else {
        println("It is not a palindrome!")
    }

    // Calculate the average of the number and its reversed value
    val average = (number + reversedNumber) / 2
    println("Average of the integer and its reversed integer is: $average")
}


// ---------- Extension Function for String Reversal ----------
// Allows calling .reversed() directly on a String
fun String.reversed(): String {

    // buildString constructs a new string efficiently
    val result = buildString {

        // Iterate from the last character to the first
        for (i in this@reversed.lastIndex downTo 0) {
            append(this@reversed[i])
        }
    }

    return result
}


// ---------- Extension Function Overloading for Long ----------
// Reverses a Long value by converting it to String and back
fun Long.reversed(): Long {
    val reversedValue = this.toString().reversed().toLong()
    return reversedValue
}
