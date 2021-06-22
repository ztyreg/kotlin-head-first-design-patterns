package ch07adapter.turkey

fun main() {
    val turkey = WildTurkey()
    val turkeyAdapter: Duck = TurkeyAdapter(turkey)

    turkey.gobble()
    turkey.fly()
    turkeyAdapter.quack()
    turkeyAdapter.fly()
}