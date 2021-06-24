package decorator.starbuzz

class Mocha(val beverage: Beverage) : CondimentDecorator() {
    override fun cost(): Double = .20 + beverage.cost()

    override val description: String
        get() = beverage.description + ", Mocha"
}
