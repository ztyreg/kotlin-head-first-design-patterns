package factory.abstractfactory

class NYPizzaIngredientFactory : PizzaIngredientFactory {
    override fun createDough(): Dough = ThinCrustDough()

    override fun createSauce(): Sauce = MarinaraSauce()

    override fun createCheese(): Cheese = ReggianoCheese()

    override fun createVeggies(): List<Veggies> = listOf(Garlic(), Onion(), Mushroom(), RedPepper())

    override fun createPepperoni(): Pepperoni = SlicedPepperoni()

    override fun createClams(): Clams = FreshClams()
}