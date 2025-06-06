



# kotlin-full-tutorial

A comprehensive guide and tutorial repository for mastering Kotlin programming. This repository covers essential concepts, practical examples, and advanced topics to help developers of all levels enhance their Kotlin skills.

## Features
- **Basic Syntax**: Learn the fundamentals of Kotlin programming.
- **Object-Oriented Programming (OOP)**: Dive into classes, objects, and inheritance.
- **Functional Programming**: Understand higher-order functions, lambdas, and more.
- **Advanced Topics**: Explore coroutines, DSLs, and type-safe builders.
- **Practical Projects**: Work on real-world examples and mini-projects.
- **Strings and Variables**: Understand how to use strings and variables effectively.

## Strings and Variables

In Kotlin, variables are defined using the `var` and `val` keywords. Strings represent sequences of characters and provide powerful manipulation features.

### Variables
- `var`: Mutable variable (can be reassigned).
- `val`: Immutable variable (cannot be reassigned after initialization).

Example:
```kotlin
fun main() {
    var mutableVar: String = "I can change"
    val immutableVar: String = "I cannot change"

    mutableVar = "Changed!"
    // immutableVar = "This will cause an error"

    println(mutableVar) // Output: Changed!
    println(immutableVar) // Output: I cannot change
}

Strings
Strings in Kotlin can be single-line or multi-line (using triple quotes).


fun main() {
    val singleLineString = "Hello, Kotlin!"
    val multiLineString = """
        This is a 
        multi-line string.
    """.trimIndent()

    println(singleLineString)
    println(multiLineString)
}

String Interpolation
Kotlin allows embedding variables and expressions directly in strings using the $ symbol.

Example:
fun main() {
    val name = "Kotlin"
    val version = 1.8
    println("Welcome to $name version $version!")
}


String Templates
Complex expressions can be wrapped in curly braces ${}.

Example:

kotlin
Copy code
fun main() {
    val a = 10
    val b = 20
    println("Sum of $a and $b is ${a + b}")
}


### Key Additions:
- **Strings and Variables**: Added a new section to cover the basics of handling variables and working with strings in Kotlin.
- **Examples**: Included code snippets to illustrate key concepts like string interpolation, templates, and multi-line strings.

Let me know if you’d like to expand on any other topic!
