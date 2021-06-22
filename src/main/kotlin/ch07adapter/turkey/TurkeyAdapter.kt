package ch07adapter.turkey

class TurkeyAdapter(private val turkey: Turkey) : Duck {
    override fun fly() {
        repeat(5) {
            turkey.fly()
        }
    }

    override fun quack() {
        turkey.gobble()
    }
}