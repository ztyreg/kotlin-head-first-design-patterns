package composite

class MenuItem(
    override val name: String,
    override val description: String,
    override val vegetarian: Boolean,
    override val price: Double
) : MenuComponent() {

    override fun print() {
        print("  $name")
        if (vegetarian) print("(v)")
        print(", $price")
        println(" -- $description")
    }

    override fun createIterator(): MutableIterator<MenuComponent> {
        return NullIterator()
    }
}