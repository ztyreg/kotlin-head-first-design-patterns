package combining

class Observable(private val duck: QuackObservable) : QuackObservable {
    private val observers = ArrayList<Observer>()

    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun notifyObservers() {
        for (observer in observers) {
            observer.update(duck)
        }
    }
}