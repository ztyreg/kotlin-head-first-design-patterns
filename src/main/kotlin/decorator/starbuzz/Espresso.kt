package decorator.starbuzz

class Espresso(override val description: String = "Espresso") : Beverage() {
    override fun cost(): Double = 1.99
}