package templatemethod.hook

class TeaWithHook : CaffeineBeverageWithHook() {
    override fun brew() = println("Steeping the tea")

    override fun addCondiments() = println("Adding Lemon")

    override fun customerWantsCondiments(): Boolean {
        val answer = getUserInput()
        return answer.startsWith("y")
    }

    private fun getUserInput(): String {
        println("Would you like lemon with your tea (y/n)?")
        return readLine() ?: "no"
    }
}