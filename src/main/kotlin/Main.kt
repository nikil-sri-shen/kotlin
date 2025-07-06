fun main() {
    // Primitive data types in Kotlin
    dataTypeFunction()

}

fun dataTypeFunction() {
    // This function calls data types functions.

    /*
    * Integer: Represents whole numbers, both positive and negative.
    * Float: Represents numbers with decimal points.
    * Boolean: Represents true or false values.
    * Char: Represents a single character.
    * String: Represents a sequence of characters.
    * Array: Represents a collection of elements of the same type.
    * */
    integerFunction();
    floatFunction();
    booleanFunction();
    charFunction();
    stringFunction();
    arrayFunction();
}

fun integerFunction() {
    // This function has basics of integer.
    var myint = 35

    // add suffix L for long integer
    var mylong = 23L

    println("My integer ${myint}")
    println("My long integer ${mylong}")

    var b1: Byte = Byte.MIN_VALUE
    var b2: Byte = Byte.MAX_VALUE
    println("Smallest byte value: " +b1)
    println("Largest byte value: " +b2)

    var S1: Short = Short.MIN_VALUE
    var S2: Short = Short.MAX_VALUE
    println("Smallest short value: " +S1)
    println("Largest short value: " +S2)

    var I1: Int = Int.MIN_VALUE
    var I2: Int = Int.MAX_VALUE
    println("Smallest integer value: " +I1)
    println("Largest integer value: " +I2)

    var L1: Long = Long.MIN_VALUE
    var L2: Long = Long.MAX_VALUE
    println("Smallest long integer value: " +L1)
    println("Largest long integer value: " +L2)
}

fun floatFunction() {
    // This function has basics of float.
    // add suffix F for float
    var myfloat = 54F
    println("My float value ${myfloat}")

    var F1: Float = Float.MIN_VALUE
    var F2: Float = Float.MAX_VALUE
    println("Smallest Float value: " +F1)
    println("Largest Float value: " + F2)

    var D1: Double = Double.MIN_VALUE
    var D2: Double = Double.MAX_VALUE
    println("Smallest Double value: " + D1)
    println("Largest Double value: " + D2)
}

fun booleanFunction() {
    // This function has basics of boolean.
    var mybool = true
    println("My boolean value ${mybool}")

    var b1: Boolean = true
    var b2: Boolean = false
    println("Boolean value 1: " +b1)
    println("Boolean value 2: " +b2)

    if (true is Boolean){
        print("Yes,true is a boolean value")
    }
}

fun charFunction() {
    // This function has basics of char.
    var mychar = 'A'
    println("My character value ${mychar}")

    var c1: Char = 'A'
    var c2: Char = 'B'
    println("Character value 1: " +c1)
    println("Character value 2: " +c2)

    if ('A' is Char){
        print("Yes,'A' is a character value")
    }

    var alphabet: Char = 'C'
    println("C is a character : ${alphabet is Char}")
}

fun stringFunction() {
    // This function has basics of string.
    var mystring = "Hello, Kotlin!"
    println("My string value ${mystring}")

    var str1: String = "Kotlin"
    var str2: String = "Programming"
    println("String value 1: " +str1)
    println("String value 2: " +str2)

    if ("Kotlin" is String){
        print("Yes,'Kotlin' is a string value")
    }

    var name: String = "geeksforgeeks"
    println("I love $name")
}

fun arrayFunction() {
    // This function has basics of array.
    var myarray = arrayOf(1, 2, 3, 4, 5)
    println("My array value ${myarray.joinToString(", ")}")

    var arr1: Array<Int> = arrayOf(1, 2, 3)
    var arr2: Array<String> = arrayOf("Kotlin", "Java")
    println("Array value 1: " +arr1.joinToString(", "))
    println("Array value 2: " +arr2.joinToString(", "))

    val Array = arrayOf("I", "Love", "GFG")
    for (i in Array) {
        println(i)
    }
}