interface IDisplyable {
    val props:Int
        get() = 0
    fun display() : Unit {
        println("Display default logic ")
    }
}