package ch09iterator.cafe

interface Menu {
    fun createIterator(): MutableIterator<MenuItem>
}