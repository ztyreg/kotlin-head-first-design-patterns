package strategy

class FlyNoWay : FlyBehavior {
    override fun fly() {
        println("I can't fly")
    }
}