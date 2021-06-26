package combining

class Quackologist : Observer {
    override fun update(duck: QuackObservable) {
        println("Quackologist: $duck just quacked.")
    }
}
