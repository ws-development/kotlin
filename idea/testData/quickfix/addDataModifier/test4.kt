// "Make 'Foo' data class" "true"
// WITH_RUNTIME
class Foo(val bar: String, var baz: Int)

fun test() {
    val list = listOf(Foo("A", 1))
    for ((foo, bar) in list<caret>) {
    }
}