package decorator.starbuzz

abstract class CondimentDecorator : Beverage() {
    abstract override val description: String
}
