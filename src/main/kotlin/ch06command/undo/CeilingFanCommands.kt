package ch06command.undo


class CeilingFan(name: String?) {
    enum class Speed {
        OFF, LOW, MEDIUM, HIGH
    }

    private val name = name
        get() = if (field != null) "$field ceiling fan" else "Ceiling fan"

    var speed = Speed.OFF

    fun high() {
        speed = Speed.HIGH
    }

    fun medium() {
        speed = Speed.MEDIUM
    }

    fun low() {
        speed = Speed.LOW
    }

    fun off() {
        speed = Speed.OFF
    }

}

class CeilingFanHighCommands(private val ceilingFan: CeilingFan) : Command {
    private var prevSpeed: CeilingFan.Speed = CeilingFan.Speed.OFF

    override fun execute() {
        prevSpeed = ceilingFan.speed
        ceilingFan.high()
    }

    override fun undo() = when (prevSpeed) {
        CeilingFan.Speed.HIGH -> ceilingFan.high()
        CeilingFan.Speed.MEDIUM -> ceilingFan.medium()
        CeilingFan.Speed.LOW -> ceilingFan.low()
        CeilingFan.Speed.OFF -> ceilingFan.off()
    }
}

class CeilingFanMediumCommands(private val ceilingFan: CeilingFan) : Command {
    private var prevSpeed: CeilingFan.Speed = CeilingFan.Speed.OFF

    override fun execute() {
        prevSpeed = ceilingFan.speed
        ceilingFan.medium()
    }

    override fun undo() = when (prevSpeed) {
        CeilingFan.Speed.HIGH -> ceilingFan.high()
        CeilingFan.Speed.MEDIUM -> ceilingFan.medium()
        CeilingFan.Speed.LOW -> ceilingFan.low()
        CeilingFan.Speed.OFF -> ceilingFan.off()
    }
}

class CeilingFanLowCommands(private val ceilingFan: CeilingFan) : Command {
    private var prevSpeed: CeilingFan.Speed = CeilingFan.Speed.OFF

    override fun execute() {
        prevSpeed = ceilingFan.speed
        ceilingFan.low()
    }

    override fun undo() = when (prevSpeed) {
        CeilingFan.Speed.HIGH -> ceilingFan.high()
        CeilingFan.Speed.MEDIUM -> ceilingFan.medium()
        CeilingFan.Speed.LOW -> ceilingFan.low()
        CeilingFan.Speed.OFF -> ceilingFan.off()
    }
}

class CeilingFanOffCommands(private val ceilingFan: CeilingFan) : Command {
    private var prevSpeed: CeilingFan.Speed = CeilingFan.Speed.OFF

    override fun execute() {
        prevSpeed = ceilingFan.speed
        ceilingFan.off()
    }

    override fun undo() = when (prevSpeed) {
        CeilingFan.Speed.HIGH -> ceilingFan.high()
        CeilingFan.Speed.MEDIUM -> ceilingFan.medium()
        CeilingFan.Speed.LOW -> ceilingFan.low()
        CeilingFan.Speed.OFF -> ceilingFan.off()
    }
}
