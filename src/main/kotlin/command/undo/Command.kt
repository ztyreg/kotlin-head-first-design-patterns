package command.undo

interface Command {
    fun execute()
    fun undo()
}