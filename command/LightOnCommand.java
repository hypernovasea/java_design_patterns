package command;


public class LightOnCommand implements Command {
    LivingRoomLight light;

    public LightOnCommand(LivingRoomLight light) {
        this.light = light;
    }


    public void execute() {
        light.on();
    }
}
