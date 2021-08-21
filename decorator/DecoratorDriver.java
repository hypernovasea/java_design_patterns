package decorator;

/**
 * Drives the decorator design pattern.
 *
 * The decorator design pattern is a STRUCTURAL pattern that attaches additional
 * responsibilities to an object dynamically. Decorators provide a flexible
 * alternative to subclassing for extending functionality.
 *
 * In this example, there are superheroes and superpowers. Each concrete superhero
 * implements the Superhero interface and each superpower implements the
 * SuperpowerDecorator interface. Once a superhero is created, it is then "decorated"
 * with its necessary superpowers. When the description of the superhero is called,
 * it will display not only its native description that's in its own class, but the
 * superpower description that it's been decorated with.
 *
 */
public class DecoratorDriver {
    public static void main(String args[]) {
        Superperson superman = new Superman();
        System.out.println(superman.getDescription() + "Number of powers = " + superman.powers());
        superman = new SuperStrength(superman);
        superman = new Flying(superman);
        superman = new Longevity(superman);
        System.out.println(superman.getDescription() + "Number of powers = " + superman.powers());

        Superperson dark_phoenix = new DarkPhoenix();
        dark_phoenix = new Telepathy(dark_phoenix);
        dark_phoenix = new Telekinesis(dark_phoenix);
        System.out.println(dark_phoenix.getDescription() + "Number of powers = " + dark_phoenix.powers());

        Superperson aquaman = new Aquaman();
        aquaman = new SuperStrength(aquaman);
        aquaman = new Telepathy(aquaman);
        System.out.println(aquaman.getDescription() + "Number of powers = " + aquaman.powers());

        Superperson hulk = new Hulk();
        hulk = new SuperStrength(hulk);
        hulk = new Intellect(hulk);
        hulk = new Longevity(hulk);
        System.out.println(hulk.getDescription() + "Number of powers = " + hulk.powers());

    }
}
