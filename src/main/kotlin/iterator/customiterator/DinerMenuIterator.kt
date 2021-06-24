package iterator.customiterator

class DinerMenuIterator(private val items: Array<MenuItem?>) : Iterator {
    var position = 0

    override fun next(): Any {
        return items[position++] ?: throw NoSuchElementException()
    }

    override fun hasNext(): Boolean {
        return !(position >= items.size || items[position] == null)
    }

}