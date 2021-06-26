package combining

fun simulate(duck: Quackable) {
    duck.quack()
}

fun simulate(duckFactory: AbstractDuckFactory) {
    val mallardDuck: Quackable = duckFactory.createMallardDuck()
    val redheadDuck: Quackable = duckFactory.createRedheadDuck()
    val duckCall: Quackable = duckFactory.createDuckCall()
    val rubberDuck: Quackable = duckFactory.createRubberDuck()
    val gooseDuck: Quackable = GooseAdapter(Goose())

    println("\nDuck Simulator")

    val flockOfDucks = Flock()

    flockOfDucks.add(mallardDuck)
    flockOfDucks.add(redheadDuck)
    flockOfDucks.add(duckCall)
    flockOfDucks.add(rubberDuck)
    flockOfDucks.add(gooseDuck)

    println("Duck Simulator: Observer")

    val quackologist = Quackologist()
    flockOfDucks.registerObserver(quackologist)

    simulate(flockOfDucks)

    println("The ducks quacked ${QuackCounter.numberOfQuacks} times")

}

fun main() {
    val duckFactory = CountingDuckFactory()
    simulate(duckFactory)

}