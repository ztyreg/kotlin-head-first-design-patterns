package ch03decorator.starbuzz

class DarkRoast(override val description: String = "Dark Roast") : Beverage() {
    override fun cost(): Double = .99
}