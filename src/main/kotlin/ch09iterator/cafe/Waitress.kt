package ch09iterator.cafe

class Waitress(val pancakeHouseMenu: PancakeHouseMenu, val dinerMenu: DinerMenu, val cafeMenu: CafeMenu) {

    fun printMenu() {
        val pancakeIterator: MutableIterator<MenuItem> = pancakeHouseMenu.createIterator()
        val dinerIterator: MutableIterator<MenuItem> = dinerMenu.createIterator()
        val cafeIterator: MutableIterator<MenuItem> = cafeMenu.createIterator()
        println("MENU\n----\nBREAKFAST")
        printMenu(pancakeIterator)
        println("\nLUNCH")
        printMenu(dinerIterator)
        println("\nCAFE")
        printMenu(cafeIterator)
    }

    fun printMenu(iterator: MutableIterator<MenuItem>) {
        while (iterator.hasNext()) {
            val menuItem: MenuItem = iterator.next()
            println("${menuItem.name}, ${menuItem.price} -- ${menuItem.description}")
        }
    }
}