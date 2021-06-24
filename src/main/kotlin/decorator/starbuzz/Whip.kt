package decorator.starbuzz

class Whip(val beverage: Beverage) : CondimentDecorator() {
    override fun cost(): Double = .10 + beverage.cost()

    override val description: String
        get() = beverage.description + ", Whip"
}
