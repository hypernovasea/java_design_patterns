package bridge;

public class JeanGray extends SuperpoweredBeing {

    public JeanGray(Telekinesis telekinesis, String description) {
        super(telekinesis, description);
    }

    public void move() {
        telekinesis.useTelekinesis();
    }
}
