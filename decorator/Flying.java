package decorator;


public class Flying extends SuperpowerDecorator {
    Superperson superperson;

    public Flying(Superperson superperson) {
        this.superperson = superperson;
    }


    public String getDescription() {
        return superperson.getDescription() + "Flying in the skies. ";
    }


    public int powers() {
        return superperson.powers() + 1;
    }
}
