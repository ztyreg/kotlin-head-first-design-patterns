package ch03decorator.starbuzz

class HouseBlend(override val description: String = "House Blend Coffee") : Beverage() {
    override fun cost(): Double = .89
}