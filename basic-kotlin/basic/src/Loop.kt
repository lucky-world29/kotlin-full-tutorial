//class Loop {
//    companion object {
//        @JvmStatic
//        fun main(args: Array<String>) {
//            if (20 > 18) {
//                println("20 is greater than 18")
//            }
//        }
//    }
//}

//fun main() {
//    val x = 20
//    val y = 18
//    if (x > y) {
//        println("x is greater than y")
//    }
//}

//fun main() {
//    val time = 20
//    if (time < 18) {
//        println("Good day.")
//    } else {
//        println("Good evening.")
//    }
//}

//fun main() {
//    val time = 22
//    if (time < 10) {
//        println("Good morning.")
//    } else if (time < 20) {
//        println("Good day.")
//    } else {
//        println("Good evening.")
//    }
//}



fun main() {
    val time = 20
    val greeting = if (time < 18) {
        "Good day."
    } else {
        "Good evening."
    }
    println(greeting)

    aa()  //      ---------------->  Call the function directly
}


//When using if as an expression, you must also include else (required).

fun aa() {
    val time = 20
    val greeting = if (time < 18) "Good day." else "Good evening."
    println(greeting)
}

//aa() // Call the function directly nah error is providing
