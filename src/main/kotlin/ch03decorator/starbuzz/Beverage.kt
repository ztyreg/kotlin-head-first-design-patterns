package ch03decorator.starbuzz

abstract class Beverage {
    open val description: String = "Unknown Beverage"

    abstract fun cost(): Double

}