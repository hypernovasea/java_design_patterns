package bridge;

public class WillowRosenberg extends SuperpoweredBeing {

    public WillowRosenberg(Telekinesis telekinesis, String description)v{
        super(telekinesis, description);
    }

    public void move() {
        telekinesis.useTelekinesis();
    }
}
