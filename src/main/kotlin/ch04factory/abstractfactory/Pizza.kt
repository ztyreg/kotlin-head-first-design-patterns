package ch04factory.abstractfactory

abstract class Pizza {
    abstract var name: String
    protected var dough: Dough? = null
    protected var sauce: Sauce? = null
    protected var veggies: List<Veggies>? = null
    protected var cheese: Cheese? = null
    protected var pepperoni: Pepperoni? = null
    protected var clam: Clams? = null

    abstract fun prepare()

    open fun bake() {
        println("Bake for 25 minutes at 350")
    }

    open fun cut() {
        println("Cutting the pizza into diagonal slices")
    }

    open fun box() {
        println("Place pizza in official PizzaStore box")
    }

    override fun toString() = "TODO: Print pizza here"

}