package combining

interface QuackObservable {
    fun registerObserver(observer: Observer)
    fun notifyObservers()
}