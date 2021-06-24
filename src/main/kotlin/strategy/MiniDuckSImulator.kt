package strategy

fun main(args: Array<String>) {
    val mallard: Duck = MallardDuck()
    mallard.performFly()
    mallard.performQuack()
    val model: Duck = ModelDuck()
    model.performFly()
    model.flyBehavior = FlyRocketPowered()
    model.performFly()
}