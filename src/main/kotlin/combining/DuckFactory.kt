package combining

class DuckFactory : AbstractDuckFactory() {
    override fun createMallardDuck(): Quackable {
        return MallardDuck()
    }

    override fun createRedheadDuck(): Quackable {
        return RedheadDuck()
    }

    override fun createDuckCall(): Quackable {
        return DuckCall()
    }

    override fun createRubberDuck(): Quackable {
        return RubberDuck()
    }
}