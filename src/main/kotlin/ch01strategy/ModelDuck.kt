package ch01strategy

class ModelDuck : Duck {
    override var flyBehavior: FlyBehavior = FlyNoWay()
    override var quackBehavior: QuackBehavior = Quack()

    override fun display() {
        println("I'm a model duck")
    }

}