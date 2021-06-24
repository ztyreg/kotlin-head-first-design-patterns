package ch09iterator.cafe

fun main() {
    val pancakeHouseMenu = PancakeHouseMenu()
    val dinerMenu = DinerMenu()
    val cafeMenu = CafeMenu()

    val waitress = Waitress(pancakeHouseMenu, dinerMenu, cafeMenu)
    waitress.printMenu()
}
