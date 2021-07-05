
//Auto-import
//kotlin, collections, io, ranges text
//java.lang.*
import kotlin.*
import formation.kotlin.convertToString as converter
fun main() {
    //Déclaration de variable
    //val ou var
    //var mutable
    /*var number = 10
    number *= 20
    println(number)
    //val muable
    val constante = "CONST"
    println(constante)
    //Typage explicite
    var firstName:String
    firstName = "abadi"

    val age:Int = 33

    var test:Any

    test = "toto"
    println(test)
    test = true
    println(test)

    //Déclaration de variable nullable
    var testNull:Any? = null
    println(testNull)*/

    //Cast entre type
    //Safe cast => is

    //var test:Any
    //test = "toto"
    /*if(test is String) {
        println("test is string")
    }
    else {
        println("test is not string")
    }*/
    /*when(test) {
        is String -> println("test is string")
        else -> {

        }
    }*/
    //Unsafe cast => as
    /*val testLikeInt = test as? Int
    println(testLikeInt)
*/
    //Structure When
    /*val mois = 7
    when(mois) {
        in 1..3 -> println("Hiver")
        else ->  {
            println("error mois")
        }
    }

    val x = 20
    val y = 30
    val result = when {
        x > 10 -> println("test")
        y < 20 -> x / y
        else -> x + y
    }
    println(result)
     */
    //Structure d'itération
    /*for(i in 1..10) {
        println(i)
    }
    //
    println("----With until----")
    for(i in 1 until 10 step 2) {
        println(i)
    }
    println("---With downto----")
    for(i in 10 downTo 1 step 2) {
        println(i)
    }*/

    //while et do while reste comme d'autre langage(c#, typescript,...)
    //Jumps and label
    //Ajouter un label
    /*firstLoop@ for(i in 1..100) {
        for(j in 1..100) {
            if(i * j%4 == 0) {
                break@firstLoop
            }
        }
    }*/

    //Label and return
    /*fun labelReturn() {
        listOf(1,2,3,4,5).forEach foreach@{
            if(it == 3) return@foreach
            println(it)
        }
        println("outside foreach")
    }
    labelReturn()*/
    //Exemple avec import
    //converter()
}