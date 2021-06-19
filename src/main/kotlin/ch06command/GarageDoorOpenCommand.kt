package ch06command

class Light {
    fun on() = println("Light is on")
    fun off() = println("Light is off")
}

class LightOnCommand(private val light: Light) : Command {
    override fun execute() {
        light.on()
    }
}