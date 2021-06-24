package iterator.javaiterator

import java.lang.IllegalStateException

class DinerMenuIterator(private val items: Array<MenuItem?>) : MutableIterator<MenuItem> {
    var position = 0

    override fun next(): MenuItem {
        return items[position++] ?: throw NoSuchElementException()
    }

    override fun hasNext(): Boolean {
        return !(position >= items.size || items[position] == null)
    }

    override fun remove() {
        if (position <= 0) throw IllegalStateException("You can't remove an item until you've done at least one next()")
        if (items[position - 1] != null) {
            for (i in position - 1..items.size - 2) {
                items[i] = items[i + 1]
            }
            items[items.size - 1] = null
        }
    }
}