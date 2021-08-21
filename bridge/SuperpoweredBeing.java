package bridge;

public abstract class SuperpoweredBeing {

    protected Telekinesis telekinesis;
    protected String description;

    protected SuperpoweredBeing(Telekinesis telekinesis, String description) {
        this.telekinesis = telekinesis;
        this.description = description;
    }

    public abstract void move();

}
