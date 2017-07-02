package command;

/**
 * Drives the command design pattern.
 *
 * The Command design pattern is a BEHAVIORAL patten that encapsulates a command
 * within an object. It decouples the command from the requester of the action and
 * object that performs the action.
 */
public class CommandDriver
{
    public static void main(String[] args)
    {
        //initialize the objects that will perform the actions
        LivingRoomLight light = new LivingRoomLight();
        Television tv = new Television();
        Stereo stereo = new Stereo();

        //initialize the commands
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        TelevisionOnCommand tvOn = new TelevisionOnCommand(tv);
        TelevisionOffCommand tvOff = new TelevisionOffCommand(tv);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        //initialize remote control and set commands
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommands(0, lightOn, lightOff);
        remoteControl.setCommands(1, tvOn, tvOff);
        remoteControl.setCommands(2, stereoOn, stereoOff);

        remoteControl.onButtonPushed(2);
        remoteControl.onButtonPushed(1);
        remoteControl.onButtonPushed(0);
        remoteControl.offButtonPushed(1);
        remoteControl.offButtonPushed(0);
        remoteControl.offButtonPushed(2);



    }
}
