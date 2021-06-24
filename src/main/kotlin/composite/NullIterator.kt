package composite

class NullIterator : MutableIterator<MenuComponent> {
    override fun next(): MenuComponent {
        throw NoSuchElementException()
    }

    override fun hasNext(): Boolean {
        return false
    }

    override fun remove() {
        throw UnsupportedOperationException()
    }
}
