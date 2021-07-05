package formation.kotlin.classes

import IDisplyable

/*class Person (firstName:String, lastName: String) {
    var firstName = firstName
    var age:Int = 0
    //Initialisation de la construction de l'objet
    init {
        println("First name ${firstName}")
    }
    var lastName = lastName
    init {
        println("Last name ${lastName}")
    }
    //constructeur secondaire
    constructor(firstName: String, lastName: String, age:Int) : this(firstName, lastName) {
       this.age = age
    }
}*/

//Déclarer une classe dont on peut hériter
open class Person(): IDisplyable {
    var firstName:String? = null
    var lastName:String? = null
    open var age:Int? = null
    init {
        //Logique constructeur
    }
    constructor(firstName:String) : this() {
        this.firstName = firstName
    }
    constructor(firstName:String, lastName:String) : this(firstName) {
        this.lastName = firstName
    }
    constructor(firstName:String, lastName:String, age:Int) : this(firstName, lastName) {
        this.age = age
    }

    override fun display() {
        println("${this.firstName} ${this.lastName} ${this.age}")
    }
}
