//Kotlin Booleans
//Very often, in programming, you will need a data type that can only have one of two values, like:
//
//YES / NO
//ON / OFF
//TRUE / FALSE
//For this, Kotlin has a Boolean data type, which can take the values true or false.

//Boolean Values

//A boolean type can be declared with the Boolean keyword and can only take the values true or false:

//fun main() {
//    val isKotlinFun: Boolean = true
//    val isFishTasty: Boolean = false
//    println(isKotlinFun)   // Outputs true
//    println(isFishTasty)   // Outputs false
//
//    val yo = true
//    val go = false
//    println(yo)   // Outputs true
//    println(go)   // Outputs false
//}

//Boolean Expression
//
// - A Boolean expression returns a Boolean value: true or false.
//
// - You can use a comparison operator, such as the greater than (>) operator
//    to find out if an expression (or a variable) is true:

fun main() {
    val x = 10
    val y = 9
    println(x > y) // Returns true, because 10 is greater than 9
    println(10 > 9) // Returns true, because 10 is greater than 9

    val a = 10;
    println(a == 10); // Returns true, because the value of x is equal to 10

    println(10 == 15); // Returns false, because 10 is not equal to 15
}