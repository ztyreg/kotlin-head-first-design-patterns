package composite

class CompositeIterator(iterator: MutableIterator<MenuComponent>) : MutableIterator<MenuComponent> {
    val stack = ArrayDeque<MutableIterator<MenuComponent>>()

    init {
        stack.add(iterator)
    }

    override fun hasNext(): Boolean {
        if (stack.isEmpty()) return false
        val iterator = stack.last()
        if (!iterator.hasNext()) {
            stack.removeLast()
            return hasNext()
        }
        return true
    }

    override fun next(): MenuComponent {
        if (hasNext()) {
            val iterator = stack.last()
            val component = iterator.next()
            if (component is Menu) {
                stack.add(component.createIterator())
            }
            return component
        } else {
            throw NoSuchElementException()
        }
    }

    override fun remove() {
        throw UnsupportedOperationException()
    }
}