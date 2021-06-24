package command.undo

fun main() {
    val remote = RemoteControl()

    val livingRoomLight = Light("Living room")
    val kitchenLight = Light("Kitchen")
    val garageDoor = GarageDoor(null)

    val livingRoomLightOn = LightOnCommand(livingRoomLight)
    val livingRoomLightOff = LightOffCommand(livingRoomLight)
    val kitchenLightOn = LightOnCommand(kitchenLight)
    val kitchenLightOff = LightOffCommand(kitchenLight)

    val garageDoorOpen = GarageDoorOpenCommand(garageDoor)
    val garageDoorClose = GarageDoorCloseCommand(garageDoor)

    remote.setCommand(0, livingRoomLightOn, livingRoomLightOff)
    remote.setCommand(1, kitchenLightOn, kitchenLightOff)
    remote.setCommand(2, garageDoorOpen, garageDoorClose)

    println(remote)

    remote.onButtonWasPushed(0)
    remote.offButtonWasPushed(0)
    remote.undoButtonWasPushed()
    remote.onButtonWasPushed(1)
    remote.offButtonWasPushed(1)
    remote.undoButtonWasPushed()
    remote.onButtonWasPushed(2)
    remote.offButtonWasPushed(2)

}
