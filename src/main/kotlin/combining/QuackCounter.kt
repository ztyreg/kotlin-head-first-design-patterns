package combining

class QuackCounter(val duck: Quackable) : Quackable {
    companion object {
        var numberOfQuacks = 0
    }

    override fun quack() {
        duck.quack()
        numberOfQuacks += 1
    }

    override fun registerObserver(observer: Observer) {
        duck.registerObserver(observer)
    }

    override fun notifyObservers() {
        duck.notifyObservers()
    }
}