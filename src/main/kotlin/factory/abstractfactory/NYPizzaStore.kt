package factory.abstractfactory

class NYPizzaStore : PizzaStore() {
    override fun createPizza(type: String): Pizza {
        val ingredientFactory = NYPizzaIngredientFactory()

        return when (type) {
            "cheese" -> CheesePizza(ingredientFactory).apply { name = "New York Style Cheese Pizza" }
//            "veggie" -> NYStyleVeggiePizza()
            "clam" -> ClamPizza(ingredientFactory).apply { name = "New York Style Clam Pizza" }
//            "pepperoni" -> NYStylePepperoniPizza()
            else -> throw NoSuchElementException("Pizza type not found!")
        }
    }
}
