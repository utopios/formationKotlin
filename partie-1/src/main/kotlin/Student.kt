package formation.kotlin.classes
class Student: Person {
    var level : Int? = null
    var informations : String? = null
    constructor(firstName:String) : super(firstName) {

    }
    constructor(firstName:String, lastName:String, age:Int, level:Int): super(firstName, lastName, age) {
        this.level = level
    }

    fun makeAllInformationAndDisplay() {
       this.informations = "${this.firstName} ${this.lastName} ${this.level} ${this.age}".also{println(it)}
    }

    override fun display() {
        println(this.level)
        super.display()
    }
}