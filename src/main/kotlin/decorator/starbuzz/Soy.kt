package decorator.starbuzz

class Soy(val beverage: Beverage) : CondimentDecorator() {
    override fun cost(): Double = .15 + beverage.cost()

    override val description: String
        get() = beverage.description + ", Soy"
}
