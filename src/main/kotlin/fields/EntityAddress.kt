package fields

class EntityAddress(
    var name: String,
    var streetName: String,
    var city: String,
    var state: String,
    var zipCode: String,
) {
    constructor() : this("", "", "", "", "")

    override fun toString(): String {
        return "$name\n$streetName\n$city, $state $zipCode"
    }
}