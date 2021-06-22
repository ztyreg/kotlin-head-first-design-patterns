package ch01strategy

abstract class Duck {
    var flyBehavior: FlyBehavior = FlyNoWay()
    var quackBehavior: QuackBehavior = Quack()

    abstract fun display()

    fun performFly() {
        flyBehavior.fly()
    }

    fun performQuack() {
        quackBehavior.quack()
    }


    fun swim() {
        println("All ducks float, even decoys!")
    }
}