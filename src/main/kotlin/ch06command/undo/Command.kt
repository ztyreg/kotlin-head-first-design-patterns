package ch06command

interface Command {
    fun execute()
    fun undo()
}