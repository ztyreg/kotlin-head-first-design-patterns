package ch08templatemethod.caffeine

class Coffee : CaffeineBeverage() {
    override fun brew() = println("Dripping Coffee through filter")

    override fun addCondiments() = println("Adding Sugar and Milk")
}