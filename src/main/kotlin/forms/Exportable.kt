package forms

import java.util.stream.Stream

interface Exportable {
    fun export(): Stream<String>
    fun import(stream: Stream<String>)
}