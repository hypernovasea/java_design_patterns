package bridge;

public class DarthVader extends SuperpoweredBeing {

    public DarthVader(Telekinesis telekinesis, String description) {
        super(telekinesis, description);
    }


    public void move() {
        telekinesis.useTelekinesis();
    }
}
