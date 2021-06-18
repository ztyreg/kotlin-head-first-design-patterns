package ch04factory.abstractfactory

class ChicagoPizzaIngredientFactory : PizzaIngredientFactory {
    override fun createDough(): Dough = ThickCrustDough()

    override fun createSauce(): Sauce = PlumTomatoSauce()

    override fun createCheese(): Cheese = MozzarellaCheese()

    override fun createVeggies(): List<Veggies> = listOf(BlackOlives(), Spinach(), Eggplant())

    override fun createPepperoni(): Pepperoni = SlicedPepperoni()

    override fun createClams(): Clams = FrozenClams()
}