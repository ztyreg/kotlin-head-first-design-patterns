package ch05singleton

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class SingletonNotThreadSafe {
    private var uniqueInstance: SingletonNotThreadSafe? = null
    val instance: SingletonNotThreadSafe?
        get() {
            if (uniqueInstance == null) {
                uniqueInstance = SingletonNotThreadSafe()
            }
            return uniqueInstance
        }
}

object SingletonThreadSafe {

}

class SingletonThreadSafe2 private constructor() {

    val empty: Boolean = false

    companion object {
        val instance: SingletonThreadSafe2 by lazy { SingletonThreadSafe2() }
    }
}

fun main() = runBlocking {
    var singletonNotSafe: SingletonNotThreadSafe?
    var singletonSafe: SingletonThreadSafe
    var singletonSafe2: SingletonThreadSafe2
    var chocolateBoiler: ChocolateBoiler


    launch {
        delay(1000L)
        singletonNotSafe = SingletonNotThreadSafe().instance
        println(singletonNotSafe)
        singletonSafe = SingletonThreadSafe
        println(singletonSafe)
        singletonSafe2 = SingletonThreadSafe2.instance
        println(singletonSafe2)
        chocolateBoiler = ChocolateBoiler
        println(chocolateBoiler)
    }

    launch {
        delay(1000L)
        singletonNotSafe = SingletonNotThreadSafe().instance
        println(singletonNotSafe)
        singletonSafe = SingletonThreadSafe
        println(singletonSafe)
        singletonSafe2 = SingletonThreadSafe2.instance
        println(singletonSafe2)
        chocolateBoiler = ChocolateBoiler
        println(chocolateBoiler)
    }

    Unit
}
