

/*fun main(args: Array<String>) {*/

/*
    println("What is your name?")
    val name = readln()
    println("Hello, $name")
*/
   /* println("Enter a number: ")

    // reads line from the standard input - keyboard
    val stringInput = readLine()!!
// converts the string input to Integer
    var integer:Int = stringInput.toInt()
    println("You entered: $integer")
*/
   /* val first: Int = 10
    val second: Int = 20

    val sum = first + second
    println("The sum is: $sum")
*/
   /* val ch = '1'

    val vowelConsonant = if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') "vowel" else "consonant"

    println("$ch is $vowelConsonant")
} */
/*fun main(args: Array<String>){
    println("Hello, world!")
}*/

/*fun main(args: Array<String>){
    println("Hello, ${args[0]}")
}*/
/*fun main(args: Array<String>){
val isUnit = println("This is an expression")
println(isUnit)}*/

/*fun main(args: Array<String>){
    val temperature = 10
    val isHot = if (temperature > 50) true else false
    println(isHot)
}*/
/*fun main(args: Array<String>){
    val temperature = 10
    val message = "The water temperature is ${ if (temperature > 50) "too warm" else "OK" }."
    println(message)}*/
import java.util.*
/*fun randomDay() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun fishFood (day : String) : String {
    return when (day) {
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "nothing"
    }
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println ("Today is $day and the fish eat $food")
}

fun main(args: Array<String>) {
    feedTheFish()
}*/

// Call function feedTheFish
feedTheFish()

// Call function swim() with default value parameter
swim() // Default value used
swim("slow") // Positional argument
swim(speed = "turtle like") // Named Parameter
}