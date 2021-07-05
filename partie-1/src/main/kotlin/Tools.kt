package formation.kotlin

fun convertToString(): Unit {
    println("Function convert to String")
}

/*fun addition(a:Int = 20, b:Int = 30): Int {
    return a + b
}*/

fun addition(a:Int=20, b:Int = 30):Int = a + b

fun additionMultipleArgs(vararg ts:Int) : Int {
    var result: Int = 0
    for (element in ts){
       result+=element
    }
    return result
}
//Add Multiple to All Int

infix fun Int.Multiple(x:Int):Int {
    return this * x
}

//Fonction avec générique

fun<T> displayGeneric(element:T) {
    println(element)
}

//Exemple HOF

fun wrapHOF(fonction:(String)->Unit, message:String) {
    fonction(message)
}

