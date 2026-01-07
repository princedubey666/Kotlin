fun main (){
    print("Enter a Number: ")
    val a = readln().toFloat()
    print("Enter second Number: ")
    val b = readln().toFloat()
    print("Enter the operation('+', '-', '*', '/'): ")
    val o = readln().trim()

    val res = when(o){
        "+" -> "$a $o $b = ${a+b}"
        "-" -> "$a $o $b = ${a-b}"
        "*" -> "$a $o $b = ${a*b}"
        "/" ->    if(b!=0f) "$a $o $b = ${a/b}"
                  else      "Not a valid expression"
        else -> "Invalid!"
    }
    print(res)
  


}
