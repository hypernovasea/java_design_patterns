package command;

/**
 * Created by artemis on 7/2/17.
 */
public class StereoOnCommand implements Command
{
    Stereo stereo;

    public StereoOnCommand(Stereo stereo)
    {
        this.stereo = stereo;
    }


    public void execute()
    {
        stereo.on();
    }
}
