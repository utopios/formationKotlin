package formation.kotlin.models

import java.time.temporal.TemporalAmount
import java.util.*

class Operation {
    private val _dateOperation:Date = Date()
    private var _amount:Double = 0.0

    val dateOperation:Date
        get() = _dateOperation

    val amount:Double
        get() = _amount

    constructor(amount: Double) {
        _amount = amount
    }
}