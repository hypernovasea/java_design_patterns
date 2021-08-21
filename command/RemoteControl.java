package command;


public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;


    public RemoteControl() {
        onCommands = new Command[3];
        offCommands = new Command[3];
    }


    public void setCommands(int slot,Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }


    public void onButtonPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonPushed(int slot) {
        offCommands[slot].execute();
    }
}
