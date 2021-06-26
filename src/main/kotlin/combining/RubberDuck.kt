package combining

class RubberDuck : Quackable {
    private val observable: Observable = Observable(this)

    override fun registerObserver(observer: Observer) {
        observable.registerObserver(observer)
    }

    override fun notifyObservers() {
        observable.notifyObservers()
    }

    override fun toString(): String {
        return "Rubber Duck"
    }

    override fun quack() {
        println("Squeak")
        notifyObservers()
    }
}