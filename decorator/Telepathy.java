package decorator;

public class Telepathy extends SuperpowerDecorator {
    
    Superperson superperson;


    public Telepathy(Superperson superperson) {
        this.superperson = superperson;
    }


    public String getDescription() {
        return superperson.getDescription() + "Communicating thru the mind. ";
    }


    public int powers() {
        return superperson.powers() + 1;
    }
}
