package forms

import java.util.stream.Stream

open class Form(var taxYear: Int) : Exportable {
    var locked: Boolean = false

    override fun export(): Stream<String> {
        TODO("Not yet implemented")
    }

    override fun import(stream: Stream<String>) {
        TODO("Not yet implemented")
    }
}