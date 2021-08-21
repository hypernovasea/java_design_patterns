package command;


public class LightOffCommand implements Command {
    LivingRoomLight light;

    public LightOffCommand(LivingRoomLight light) {
        this.light = light;
    }


    public void execute() {
        light.off();
    }
}
