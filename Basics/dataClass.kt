import kotlin.math.PI

fun main() {

    val cir1 = Circle(15f)
    val cir2 = Circle(15f)

    println("Are circles equal?: ${cir1 == cir2}") // true (structural equality)
    println("Are areas equal?: ${cir1.area == cir2.area}")

    println(cir1)        // auto-generated toString()
    println(cir1.area)
}

// Data class
data class Circle(val radius: Float) {
    val area = radius * radius * PI
}
