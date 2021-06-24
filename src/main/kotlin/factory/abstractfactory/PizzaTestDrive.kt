package factory.abstractfactory

fun main() {
    val nyStore = NYPizzaStore()
    val chicagoStore = ChicagoPizzaStore()

    var pizza = nyStore.orderPizza("cheese")
    println("Ethan ordered a ${pizza.name}\n")

    pizza = chicagoStore.orderPizza("cheese")
    println("Joel ordered a ${pizza.name}")
}