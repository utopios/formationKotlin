package formation.kotlin.models

class BankAccount {
    private var _customer: Customer? = null
    private var _operations:MutableList<Operation>? = null
    val customer: Customer?
        get() = _customer

    val operations:List<Operation>?
        get() = _operations

    constructor(customer: Customer) {
        _customer = customer
        _operations = mutableListOf()
    }
    fun depot(operation: Operation):Boolean {
       return _operations?.add(operation)!!
    }

    fun retrait(operation: Operation):Boolean {
        return _operations?.add(operation)!!
    }
}