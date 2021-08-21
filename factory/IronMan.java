package factory;


public class IronMan implements Avenger {

    public IronMan() {}

    public void save() {
        System.out.println("\n\nCalling Iron Man...");
        System.out.println("Call the suit.");
        System.out.println("Fly in.");
        System.out.println("Hit the Mandarin with a repulsor blast!");
        System.out.println("The city is saved!");

    }
}
