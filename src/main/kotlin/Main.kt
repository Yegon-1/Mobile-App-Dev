fun main(args: Array<String>) {

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
    val ch = '1'

    val vowelConsonant = if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') "vowel" else "consonant"

    println("$ch is $vowelConsonant")
}
