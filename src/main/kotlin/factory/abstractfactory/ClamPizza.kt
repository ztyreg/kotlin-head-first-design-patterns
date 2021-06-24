package factory.abstractfactory

class ClamPizza(private val ingredientFactory: PizzaIngredientFactory) : Pizza() {
    override var name: String = "Cheese Pizza"

    override fun prepare() {
        println("Preparing $name")
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSauce()
        cheese = ingredientFactory.createCheese()
        clam = ingredientFactory.createClams()
    }

}