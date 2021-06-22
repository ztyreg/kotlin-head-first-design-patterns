package ch08templatemethod.caffeine

abstract class CaffeineBeverage {
    fun prepareRecipe() {
        boilWater()
        brew()
        pourInCup()
        addCondiments()
    }

    abstract fun brew()

    abstract fun addCondiments()

    fun boilWater() = println("Boiling water")

    fun pourInCup() = println("Pouring into cup")

}