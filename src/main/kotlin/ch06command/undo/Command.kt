package ch06command.undo

interface Command {
    fun execute()
    fun undo()
}