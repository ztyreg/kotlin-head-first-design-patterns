package composite

fun main() {
    val pancakeHouseMenu: MenuComponent = Menu("PANCAKE HOUSE MENU", "Breakfast")
    val dinerMenu: MenuComponent = Menu("DINER MENU", "Lunch")
    val cafeMenu: MenuComponent = Menu("CAFE MENU", "Dinner")
    val dessertMenu: MenuComponent = Menu("DESSERT MENU", "Dessert of course!")

    val allMenus: MenuComponent = Menu("ALL MENUS", "All menus combined")

    allMenus.add(pancakeHouseMenu)
    allMenus.add(dinerMenu)
    allMenus.add(cafeMenu)

    dinerMenu.add(
        MenuItem(
            "Pasta",
            "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
            true,
            3.89
        )
    )
    dinerMenu.add(dessertMenu)
    dessertMenu.add(
        MenuItem(
            "Apple Pie",
            "Apple pie with a flakey crust, topped with vanilla icecream",
            true,
            1.59
        )
    )

    val waitress = Waitress(allMenus)
    waitress.printMenu()
    waitress.printVegetarianMenu()
}
