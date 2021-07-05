package formation.kotlin.classes

import IDiplyable2
import IDisplyable
import java.lang.Exception

class Car: IDisplyable, IDiplyable2 {
    private var _model:String? = null
    var model:String?
        get(){
            return this._model
        }
        set(value) {
            this._model = value
        }

    override fun display() {
        super<IDisplyable>.display()
        super<IDiplyable2>.display()
    }
    //var price:Double? = null
}