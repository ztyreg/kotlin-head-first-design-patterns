package factory.abstractfactory

class CheesePizza(private val ingredientFactory: PizzaIngredientFactory) : Pizza() {
    override var name: String = "Cheese Pizza"

    override fun prepare() {
        println("Preparing $name")
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSauce()
        cheese = ingredientFactory.createCheese()
    }

}