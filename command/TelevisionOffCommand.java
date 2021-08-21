package command;

public class TelevisionOffCommand implements Command {

    Television tv;

    public TelevisionOffCommand(Television tv) {
        this.tv = tv;
    }


    public void execute() {
        tv.on();
    }
}
