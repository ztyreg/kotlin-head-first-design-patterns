package combining

class DuckCall : Quackable {
    private val observable: Observable = Observable(this)

    override fun registerObserver(observer: Observer) {
        observable.registerObserver(observer)
    }

    override fun notifyObservers() {
        observable.notifyObservers()
    }

    override fun quack() {
        println("Kwak")
        notifyObservers()
    }

    override fun toString(): String {
        return "Duck Call"
    }
}