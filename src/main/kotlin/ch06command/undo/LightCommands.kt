package ch06command.undo

class Light(name: String?) {
    private val name = name
        get() = if (field != null) "$field light" else "Light"

    fun on() = println("$name is on")
    fun off() = println("$name is off")
}

class LightOnCommand(private val light: Light) : Command {
    override fun execute() {
        light.on()
    }

    override fun undo() {
        light.off()
    }
}

class LightOffCommand(private val light: Light) : Command {
    override fun execute() {
        light.off()
    }

    override fun undo() {
        light.on()
    }
}
