import kotlin.math.PI

// Demonstrates behavior of normal (non-data) classes
fun main() {

    // Objects with same values but different references
    val rect1 = R(6f, 5f)
    val rect2 = R(5f, 6f)

    println("Rectangle 1 area: ${rect1.area}")
    println("Rectangle 2 area: ${rect2.area}")

    // Value comparison of properties
    println("Are areas equal?: ${rect1.area == rect2.area}")

    // Reference equality since equals() is not overridden
    println("Are rectangles equal?: ${rect1 == rect2}")

    //Finding max area using a helper function
    val macks = max(rect1, rect2)
    println("Max area between them is $macks")
}

// Returns the maximum area between two rectangles.
fun max(rect1: R, rect2: R): Float {
    return maxOf(rect1.area, rect2.area)
}

// Normal class with primary constructor and computed property
class R(val a: Float, val b: Float) {
    val area = a*b
}

