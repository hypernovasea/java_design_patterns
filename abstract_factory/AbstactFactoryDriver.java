package abstract_factory;

/**
 * Drives the abstract factory pattern.
 *
 * The Abstract Factory design pattern is a CREATIONAL pattern in which a
 * "factory" creates other factories which creates concrete objects. In Abstract
 * Factory pattern an interface is responsible for creating a factory of related
 * objects without explicitly specifying their classes. Each generated factory
 * can give the objects as per the Factory pattern.
 *
 * In this example, a superhero factory will be produced based on the type
 * specified : strong, fast, or psychic. Once the correct factory is given,
 * a superhero object will be created depending on the type specified.
 */
public class AbstactFactoryDriver {
    public static void main(String args[]) {
        SuperheroAbstractFactory strong = FactoryProducer.getFactory("Strong");
        StrongSuperhero superman = strong.getStrongHero("Superman");
        superman.save();

        SuperheroAbstractFactory psychic = FactoryProducer.getFactory("Psychic");
        PsychicSuperhero cable = psychic.getPsychicHero("Cable");
        cable.save();

    }
}
