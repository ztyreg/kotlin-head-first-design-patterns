package singleton


object ChocolateBoiler {

    private var empty: Boolean = true
    private var boiled: Boolean = false

    val isEmpty: Boolean
        get() = empty
    val isBoiled: Boolean
        get() = boiled

    fun fill() {
        if (isEmpty) {
            empty = false
            boiled = false
        }
    }

    fun drain() {
        if (!isEmpty && isBoiled) {
            empty = true
        }
    }

    fun boil() {
        if (!isEmpty && !isBoiled) {
            boiled = true
        }
    }

}