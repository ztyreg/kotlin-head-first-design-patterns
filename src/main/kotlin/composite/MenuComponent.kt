package composite

abstract class MenuComponent {
    open val name: String
        get() = throw UnsupportedOperationException()
    open val description: String
        get() = throw UnsupportedOperationException()
    open val vegetarian: Boolean
        get() = throw UnsupportedOperationException()
    open val price: Double
        get() = throw UnsupportedOperationException()


    open fun add(menuComponent: MenuComponent) {
        throw UnsupportedOperationException()
    }

    open fun remove(menuComponent: MenuComponent) {
        throw UnsupportedOperationException()
    }

    open fun getChild(i: Int): MenuComponent {
        throw UnsupportedOperationException()
    }

    open fun print() {
        throw UnsupportedOperationException()
    }

    open fun createIterator(): MutableIterator<MenuComponent> {
        throw UnsupportedOperationException()
    }
}