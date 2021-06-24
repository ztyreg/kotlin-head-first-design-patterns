package state

interface State {
    fun insertQuarter()
    fun ejectQuarter()
    fun turnCrank()
    fun dispense()
}