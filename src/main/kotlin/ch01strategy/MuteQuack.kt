package ch01strategy

class MuteQuack : QuackBehavior {
    override fun quack() {
        println("<< Silence >>")
    }
}