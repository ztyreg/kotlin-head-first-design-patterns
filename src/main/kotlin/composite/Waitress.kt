package composite

class Waitress(private val allMenus: MenuComponent) {
    fun printMenu() = allMenus.print()

    fun printVegetarianMenu() {
        val iterator = allMenus.createIterator()
        println("\nVEGETARIAN MENU\n----")
        iterator.forEach {
            try {
                if (it.vegetarian) it.print()
            } catch (e: UnsupportedOperationException) {
            }
        }
    }
}