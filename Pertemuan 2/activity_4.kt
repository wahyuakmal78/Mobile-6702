fun main() {
    
    val age = 20
    val name = "To you"
    
    val border = "`-._,-'"
    val timesToRepeat = 4
    
    printBorder(border, timesToRepeat)
    printBorderTop()
    println("Happy Birthday, ${name}!")
    printBorderBottom()
    printBorder(border, timesToRepeat)

    println("")

    println("You are already ${age} days old, ${name}!")
    println("${age} days old is the very best age to celebrate!")
    
    val layers = 5
    printCakeCandles(age)
    printCakeTop(age)
    printCakeBottom(age, layers)
}

fun printBorderTop() {
    repeat(23) {
        print("=")
    }
    println()
}
fun printBorderBottom() {
    repeat(23) {
        print(":")
    }
    println()
}
fun printBorder(border: String, timesToRepeat: Int) {
    repeat(timesToRepeat) {
        print(border)
    }
    println()
}

fun printCakeCandles(age: Int) {
    print (" ")
    repeat(age) {
          print(",")
    }
    println()

    print(" ") 
    repeat(age) {
        print("|")
    }
    println()
}

fun printCakeTop(age: Int) {
    repeat(age + 2) {
        print("=")
    }
    println()
}

fun printCakeBottom(age: Int, layers: Int) {
    repeat(layers) {
        repeat(age + 2) {
            print("@")
        }
        println()
    }
}