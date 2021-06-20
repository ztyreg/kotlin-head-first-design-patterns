package ch06command.undo

class GarageDoor(name: String?) {
    private val name = name
        get() = if (field != null) "$field garage door" else "Garage door"

    fun open() = println("$name is open")
    fun close() = println("$name is closed")
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
