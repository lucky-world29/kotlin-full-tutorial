

//fun main() {
//    var txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
//    println("The length of the txt string is: " + txt.length);
//  }

//fun main() {
//    var name: String
//    name = "John"
//    println(name)
//}

//fun main() {
//    var txt = "Hello World"
//    println(txt[0]) // first element/character
//    println(txt[2]) // third element/character
//}

//fun main() {
//    var txt = "Hello World"
//    println(txt.uppercase())
//    println(txt.lowercase())
//}

//fun main() {
//    var txt1 = "Hello World"
//    var txt2 = "Hello World"
//    println(txt1.compareTo(txt2))  // Outputs 0 (they are equal) otherwise -1
//}

//fun main() {
//    var txt1 = "It's alright"
//    var txt2 = "That's great"
//    println(txt1)
//    println(txt2)
//}

//fun main() {
//    var firstName = "Soul"
//    var lastName = "Mate"
//    println(firstName + " " + lastName)
//}

//You can also use the plus() function to concatenate two strings:

//fun main() {
//    var firstName = "Lucky "
//    var lastName = "Rex"
//    println(firstName.plus(lastName))
//}

//String Templates/Interpolation
// - Instead of concatenation, you can also use "string templates",
// - which is an easy way to add variables and expressions inside a string.
//
//Just refer to the variable with the $ symbol:

fun main() {
    var firstName = "Abinash"
    var lastName = "Behera"
    println("My name is $firstName  $lastName")
}

//"String Templates" is a popular feature of Kotlin,
//  as it reduces the amount of code. For example,
//  you do not have to specify a whitespace between firstName and lastName,
//  like we did in the concatenation example.