package strategy

interface Duck {
    var flyBehavior: FlyBehavior
    var quackBehavior: QuackBehavior

    fun display() {
        println("I'm a duck")
    }

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