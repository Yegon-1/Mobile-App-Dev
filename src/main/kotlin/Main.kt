fun main(args: Array<String>) {

/*
    println("What is your name?")
    val name = readln()
    println("Hello, $name")
*/
    println("Enter a number: ")

    // reads line from the standard input - keyboard
    val stringInput = readLine()!!
// converts the string input to Integer
    var integer:Int = stringInput.toInt()
    println("You entered: $integer")
}
