package fields

class Field<T>(val name: String, var value: T, var box: String?) {
    constructor(name: String, value: T) : this(name, value, null)

    override fun toString(): String {
        return "${box}  ${name}: ${value.toString()}"
    }
}