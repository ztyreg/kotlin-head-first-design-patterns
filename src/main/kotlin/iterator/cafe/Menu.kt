package iterator.cafe

interface Menu {
    fun createIterator(): MutableIterator<MenuItem>
}