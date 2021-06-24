package iterator.javaiterator

class Waitress(val pancakeHouseMenu: PancakeHouseMenu, val dinerMenu: DinerMenu) {

    fun printMenu() {
        val pancakeIterator: MutableIterator<MenuItem> = pancakeHouseMenu.createIterator()
        val dinerIterator: MutableIterator<MenuItem> = dinerMenu.createIterator()
        println("MENU\n----\nBREAKFAST")
        printMenu(pancakeIterator)
        println("\nLUNCH")
        printMenu(dinerIterator)
    }

    fun printMenu(iterator: MutableIterator<MenuItem>) {
        while (iterator.hasNext()) {
            val menuItem: MenuItem = iterator.next() as MenuItem
            println("${menuItem.name}, ${menuItem.price} -- ${menuItem.description}")
        }
    }
}