package ch07adapter.turkey

class WildTurkey : Turkey {
    override fun gobble() {
        println("Gobble gobble")
    }

    override fun fly() {
        println("i'm flying a short distance")
    }
}