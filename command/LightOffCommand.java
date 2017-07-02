package command;

/**
 * Created by artemis on 7/2/17.
 */
public class LightOffCommand implements Command
{
    LivingRoomLight light;

    public LightOffCommand(LivingRoomLight light)
    {
        this.light = light;
    }


    public void execute(){
        light.off();
    }
}
