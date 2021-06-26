package combining

class GooseAdapter(private val goose: Goose) : Quackable {
    private val observable: Observable = Observable(this)

    override fun quack() {
        goose.honk()
        notifyObservers()
    }

    override fun registerObserver(observer: Observer) {
        observable.registerObserver(observer)
    }

    override fun notifyObservers() {
        observable.notifyObservers()
    }

    override fun toString(): String {
        return "Goose pretending to be a Duck"
    }
}