package factory.abstractfactory

class ChicagoPizzaStore : PizzaStore() {
    override fun createPizza(type: String): Pizza {
        val ingredientFactory = ChicagoPizzaIngredientFactory()

        return when (type) {
            "cheese" -> CheesePizza(ingredientFactory).apply { name = "Chicago Style Cheese Pizza" }
//            "veggie" -> ChicagoStyleVeggiePizza()
            "clam" -> ClamPizza(ingredientFactory).apply { name = "Chicago Style Clam Pizza" }
//            "pepperoni" -> ChicagoStylePepperoniPizza()
            else -> throw NoSuchElementException("Pizza type not found!")
        }
    }
}
