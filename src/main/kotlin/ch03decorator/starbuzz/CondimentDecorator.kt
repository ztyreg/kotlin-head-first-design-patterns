package ch03decorator.starbuzz

abstract class CondimentDecorator : Beverage() {
    abstract override val description: String
}
