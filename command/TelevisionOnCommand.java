package command;

/**
 * Created by artemis on 7/2/17.
 */
public class TelevisionOnCommand implements Command
{
    Television tv;

    public TelevisionOnCommand(Television tv)
    {
        this.tv = tv;
    }


    public void execute(){
        tv.on();
    }
}
