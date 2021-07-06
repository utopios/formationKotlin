package kotlin.formation.models

class Customer {
    private var _firstName:String = ""
    private var _lastName:String = ""
    private var _phone:String = ""

    var firstName:String
        get() = _firstName
        set(value) {
            _firstName = value
        }
    var lastName:String
        get() = _lastName
        set(value) {
            _lastName = value
        }
    var phone:String
        get() = _phone
        set(value) {
            _phone = value
        }

    constructor(firstName: String, lastName: String, phone:String) {
        this.firstName = firstName
        this.lastName = lastName
        this.phone = phone
    }
}