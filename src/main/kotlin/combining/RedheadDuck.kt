package combining

class RedheadDuck : Quackable {
    private val observable: Observable = Observable(this)

    override fun registerObserver(observer: Observer) {
        observable.registerObserver(observer)
    }

    override fun notifyObservers() {
        observable.notifyObservers()
    }

    override fun quack() {
        println("Quack")
        notifyObservers()
    }

    override fun toString(): String {
        return "Redhead Duck"
    }
}