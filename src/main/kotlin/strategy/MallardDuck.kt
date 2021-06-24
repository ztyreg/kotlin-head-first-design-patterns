package strategy

class MallardDuck : Duck {
    override var flyBehavior: FlyBehavior = FlyWithWings()
    override var quackBehavior: QuackBehavior = Quack()
    override fun display() {
        println("I'm a real Mallard duck")
    }
}