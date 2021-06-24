package state

class GumballMachine(internal var count: Int) {
    internal val soldOutState: State = SoldOutState(this)
    internal val noQuarterState: State = NoQuarterState(this)
    internal val hasQuarterState: State = HasQuarterState(this)
    internal val soldState: State = SoldState(this)

    internal var state: State = if (count == 0) soldOutState else noQuarterState

    fun insertQuarter() {
        state.insertQuarter()
    }

    fun ejectQuarter() {
        state.ejectQuarter()
    }

    fun turnCrank() {
        state.turnCrank()
        state.dispense()
    }

    internal fun releaseBall() {
        println("A gumball comes rolling out the slot...")
        if (count != 0) {
            count -= 1
        }
    }

}