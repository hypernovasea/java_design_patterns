package command;

/**
 * Created by artemis on 7/2/17.
 */
public class LightOnCommand implements Command
{
    LivingRoomLight light;

    public LightOnCommand(LivingRoomLight light)
    {
        this.light = light;
    }


    public void execute(){
        light.on();
    }
}
