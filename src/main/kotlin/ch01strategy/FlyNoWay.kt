package ch01strategy

class FlyNoWay : FlyBehavior {
    override fun fly() {
        println("I can't fly")
    }
}