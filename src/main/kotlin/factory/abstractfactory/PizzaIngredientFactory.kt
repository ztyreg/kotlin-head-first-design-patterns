package factory.abstractfactory

open class Dough
open class Sauce
open class Cheese
open class Veggies
open class Pepperoni
open class Clams

class ThinCrustDough : Dough()
class ThickCrustDough : Dough()

class MarinaraSauce : Sauce()
class PlumTomatoSauce : Sauce()

class ReggianoCheese : Cheese()
class MozzarellaCheese : Cheese()

class Garlic : Veggies()
class Onion : Veggies()
class Mushroom : Veggies()
class RedPepper : Veggies()
class BlackOlives : Veggies()
class Spinach : Veggies()
class Eggplant : Veggies()

class SlicedPepperoni : Pepperoni()

class FreshClams : Clams()
class FrozenClams : Clams()

interface PizzaIngredientFactory {
    fun createDough(): Dough
    fun createSauce(): Sauce
    fun createCheese(): Cheese
    fun createVeggies(): List<Veggies>
    fun createPepperoni(): Pepperoni
    fun createClams(): Clams
}