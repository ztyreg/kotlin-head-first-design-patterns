package templatemethod.hook

fun main() {
    val teaHook = TeaWithHook()
    val coffeeHook = CoffeeWithHook()

    println("Making tea...")
    teaHook.prepareRecipe()

    println("Making coffee")
    coffeeHook.prepareRecipe()

}