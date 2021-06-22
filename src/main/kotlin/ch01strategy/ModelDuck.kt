package ch01strategy

class ModelDuck : Duck() {
    override fun display() {
        println("I'm a model duck")
    }

    init {
        flyBehavior = FlyNoWay()
        quackBehavior = Quack()
    }
}