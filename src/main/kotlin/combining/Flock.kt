package combining

class Flock : Quackable {
    private val quackers = ArrayList<Quackable>()

    override fun registerObserver(observer: Observer) {
        for (quacker in quackers) {
            quacker.registerObserver(observer)
        }
    }

    override fun notifyObservers() {
    }

    fun add(quacker: Quackable) {
        quackers.add(quacker)
    }

    override fun quack() {
        for (quacker in quackers) {
            quacker.quack()
        }
    }

}