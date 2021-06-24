package state

class HasQuarterState(private val gumballMachine: GumballMachine) : State {
    override fun insertQuarter() {
        println("You can't insert another quarter")
    }

    override fun ejectQuarter() {
        println("Quarter returned")
    }

    override fun turnCrank() {
        println("You turned...")
        gumballMachine.state = gumballMachine.soldState
    }

    override fun dispense() {
        println("No gumball dispensed")
    }
}