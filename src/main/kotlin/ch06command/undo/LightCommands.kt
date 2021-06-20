package ch06command

class Light(private val name: String?) {
    fun on() = if (name != null) println("$name light is on") else println("Light is on")
    fun off() = if (name != null) println("$name light is off") else println("Light is off")
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
