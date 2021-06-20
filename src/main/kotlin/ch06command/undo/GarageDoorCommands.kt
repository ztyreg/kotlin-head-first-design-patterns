package ch06command

class GarageDoor(private val name: String?) {
    fun open() = if (name != null) println("$name garage is open") else println("Garage is open")
    fun close() = if (name != null) println("$name garage is closed") else println("Garage is closed")
}

class GarageDoorOpenCommand(private val garageDoor: GarageDoor) : Command {
    override fun execute() {
        garageDoor.open()
    }

    override fun undo() {
        garageDoor.close()
    }
}

class GarageDoorCloseCommand(private val garageDoor: GarageDoor) : Command {
    override fun execute() {
        garageDoor.close()
    }

    override fun undo() {
        garageDoor.open()
    }
}
