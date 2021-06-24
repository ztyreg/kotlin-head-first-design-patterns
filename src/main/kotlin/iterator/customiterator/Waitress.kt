package iterator.customiterator

class Waitress(val pancakeHouseMenu: PancakeHouseMenu, val dinerMenu: DinerMenu) {

    fun printMenu() {
        val pancakeIterator: Iterator = pancakeHouseMenu.createIterator()
        val dinerIterator: Iterator = dinerMenu.createIterator()
        println("MENU\n----\nBREAKFAST")
        printMenu(pancakeIterator)
        println("\nLUNCH")
        printMenu(dinerIterator)
    }

    fun printMenu(iterator: Iterator) {
        while (iterator.hasNext()) {
            val menuItem: MenuItem = iterator.next() as MenuItem
            println("${menuItem.name}, ${menuItem.price} -- ${menuItem.description}")
        }
    }
}