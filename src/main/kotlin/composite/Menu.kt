package composite

class Menu(
    override val name: String,
    override val description: String
) : MenuComponent() {

    private val menuComponents = ArrayList<MenuComponent>()

    private val iterator: MutableIterator<MenuComponent> by lazy { CompositeIterator(menuComponents.iterator()) }

    override fun add(menuComponent: MenuComponent) {
        menuComponents.add(menuComponent)
    }

    override fun remove(menuComponent: MenuComponent) {
        menuComponents.remove(menuComponent)
    }

    override fun getChild(i: Int): MenuComponent {
        return menuComponents[i]
    }

    override fun print() {
        println("\n$name, $description")
        println("---------------------")
        menuComponents.forEach { it.print() }
    }

    override fun createIterator(): MutableIterator<MenuComponent> {
        return iterator
    }

}