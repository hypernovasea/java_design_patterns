package factory;

/**
 * Drivers the factory design pattern. Creates a special Avenger based on the enemy provided.
 *
 * The Factory design pattern is a CREATIONAL pattern in which an interface leaves the creation
 * of a particular class up to the subclass.
 */
public class AvengerFactoryDriver {

    public static void main(String[] args){

        AvengerFactory factory  = new AvengerFactory();

        System.out.println("Oh no!! The Mandarin is causing trouble. We need an Avenger.");
        Avenger avenger1 = factory.getAvenger("The Mandarin");
        avenger1.save();

        System.out.println("\n\nOh no!! SHIELD needs help. We need an Avenger.");
        Avenger avenger2 = factory.getAvenger("");
        avenger2.save();

        System.out.println("\n\nOh no!! Red Skull is up to his old tricks. We need an Avenger.");
        Avenger avenger3 = factory.getAvenger("Red Skull");
        avenger3.save();

        System.out.println("\n\nOh no!! Doc Ock is running amuck. We need an Avenger.");
        Avenger avenger4 = factory.getAvenger("Doc Ock");
        avenger4.save();

    }
}
