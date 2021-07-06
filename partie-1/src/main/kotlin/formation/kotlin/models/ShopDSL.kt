package formation.kotlin.models

class AddressBuilder() {
    var city = ""
    var street = ""
    fun build() = Address(city,street)
}

class ShopBuilder() {
    var name = ""
    var address:Address? = null
    var products:MutableList<String> = mutableListOf()
    var orders:MutableMap<String,String> = mutableMapOf()
    fun build() = Shop(name,address, products)
    fun address(init : AddressBuilder.() -> Unit) {
        this.address = AddressBuilder().apply(init).build()
    }

    /*fun address(init : (AddressBuilder) -> Unit) {
        this.address = AddressBuilder().apply(init).build()
    }*/

    infix fun product(product:String) {
        this.products.add(product)
    }

    infix fun String.order(value:String) {
        orders.put(this, value)
    }
}

fun shop(init: ShopBuilder.() -> Unit) = ShopBuilder().apply(init).build()