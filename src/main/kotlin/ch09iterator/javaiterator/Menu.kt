package ch09iterator.javaiterator

interface Menu {
    fun createIterator(): MutableIterator<MenuItem>
}