package ch09iterator.customiterator

interface Iterator {
    fun hasNext(): Boolean
    fun next(): Any
}