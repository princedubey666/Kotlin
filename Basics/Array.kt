fun main() {
    println("Enter the index: ")
    val input = readln().toIntOrNull()?:0
    val numbs = intArrayOf(1, 9, 2, 8) + 3
    println("Array before adding a number: ${numbs.contentToString()} ")
    val replacedValue = numbs[input]
    print("Enter number to replace at index $input: ")
    val value = readln().toIntOrNull()?:0
    numbs[input] = value

    println("Array after replacing: ${numbs.contentToString()}")

    if (input in 0..numbs.lastIndex){
        println("$replacedValue is replaced with ${numbs[input]}. \n")
    }

//list data type

    val a = listOf<Int>(5, 6, 7, 8, 69)

    val b = a.last()  //last element of the list
    val c = a.first()  ////first element of the list
    val d = a.lastIndex //last index number of the list
    println(a)
    println(b)
    println(c)
    println(d)
    println(59 in a) //boolean -> is 59 in a or not?

}
