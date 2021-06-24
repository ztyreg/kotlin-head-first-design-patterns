package state

class SoldOutState(private val gumballMachine: GumballMachine) : State {
    override fun insertQuarter() {
        println("Sold out!")
    }

    override fun ejectQuarter() {
        println("Sold out!")
    }

    override fun turnCrank() {
        println("Sold out!")
    }

    override fun dispense() {
        println("Sold out!")
    }
}