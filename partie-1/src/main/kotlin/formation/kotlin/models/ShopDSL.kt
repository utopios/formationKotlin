package formation.kotlin.models

class AddressBuilder() {
    var city = ""
    var street = ""
    fun build() = Address(city,street)
}

class ShopBuilder() {
    var name = ""
    var address:Address? = null
    fun build() = Shop(name,address)
    fun address(init : AddressBuilder.() -> Unit) {
        this.address = AddressBuilder().apply(init).build()
    }
}

fun shop(init: ShopBuilder.() -> Unit) = ShopBuilder().apply(init).build()