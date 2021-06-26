package combining

class CountingDuckFactory : AbstractDuckFactory() {
    override fun createMallardDuck(): Quackable {
        return QuackCounter(MallardDuck())
    }

    override fun createRedheadDuck(): Quackable {
        return QuackCounter(RedheadDuck())
    }

    override fun createDuckCall(): Quackable {
        return QuackCounter(DuckCall())
    }

    override fun createRubberDuck(): Quackable {
        return QuackCounter(RubberDuck())
    }
}