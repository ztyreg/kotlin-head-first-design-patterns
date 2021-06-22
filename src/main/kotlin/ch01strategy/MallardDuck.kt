package ch01strategy

class MallardDuck : Duck() {
    override fun display() {
        println("I'm a real Mallard duck")
    }

    init {
        quackBehavior = Quack()
        flyBehavior = FlyWithWings()
    }
}