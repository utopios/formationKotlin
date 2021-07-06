
//Auto-import
//kotlin, collections, io, ranges text
//java.lang.*
import formation.kotlin.*
import formation.kotlin.classes.Car
import formation.kotlin.classes.DataPerson
import formation.kotlin.classes.Person
import formation.kotlin.classes.Student
import formation.kotlin.models.shop
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
    //println(addition(b=30))
    /*println(additionMultipleArgs(1,2,5))

    println(2 Multiple 5)

    displayGeneric("toto")
    displayGeneric(10)

    wrapHOF({m->println(m)}, "toto")
    val maFonction : (String,Int) -> Unit = { e1, e2->println(e1 + e2)}
    wrapHOF({ println(it) }, "toto")

    //Récupérer le resultat d'une fonctions dans le scope d'une expression lambda
    additionMultipleArgs(4,5,6).let { println(it) }*/
    /*val p1 = Person("abadi","ihab", 33)
    val p2 = Person()
    println(p1.firstName + " "+p1.lastName + " "+p1.age)

    val s1:Person = Student("toto", "tata", 40, 5)
    /*s1.makeAllInformationAndDisplay()
    println(s1.informations)*/
    s1.display()
    println(s1::class.qualifiedName)*/

    /*val c1 = Car()
    c1.model = "Kia"
    c1.display()*/
    /*val isNotEven = object : IntPredicate {
        override fun accept(element: Int): Boolean {
            return element % 2 != 0
        }
    }*/

    //val isNotEven = IntPredicate { it % 2 != 0 }

    //println(isNotEven.accept(25))

    /*val dataP1 = DataPerson("toto", "tata",30)
    println(dataP1)
    val dataP2 = dataP1.copy(age = 33)
    println(dataP2)*/
   /*val listeEntier: MutableList<Int> = mutableListOf(45,35)
    for(i in 1..11) {
        listeEntier.add(i)
    }
    listeEntier.removeIf { it%3==0 }
    println(listeEntier)

    val map = mapOf("key1" to "toto", "key2" to "titi")
    for((key,value) in map) {
        println(key + " : "+ value)
    }*/

    //Opérateur null safety
    //var name = "toto"
    //println(name.length)

    //var name2:String? = null
    //elvis operator
    //println(name2?.length ?: 0)
    //Operator !!
    //println(name2!!.length)
    /*shop {
        name = "shop 1"
        address = address {
            city =  "lille"
        }
        products = products {

        }
    }*/

    var s1 = shop {
        name = "shop 1"
        address {
            city = "lille"
            street = "rue de paris"
        }
    }
    println(s1.toString())
}
