package ch09iterator.javaiterator

fun main() {
    val pancakeHouseMenu = PancakeHouseMenu()
    val dinerMenu = DinerMenu()

    val waitress = Waitress(pancakeHouseMenu, dinerMenu)
    waitress.printMenu()
}
