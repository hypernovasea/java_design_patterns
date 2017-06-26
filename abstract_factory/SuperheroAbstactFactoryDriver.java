package abstract_factory;

/**
 * Drives the abstract factory pattern.
 *
 * The Abstract Factory design pattern is a CREATIONAL pattern in which a
 * "factory" creates other factories which creates concrete objects. In Abstract
 * Factory pattern an interface is responsible for creating a factory of related
 * objects without explicitly specifying their classes. Each generated factory
 * can give the objects as per the Factory pattern.
 */
public class SuperheroAbstactFactoryDriver
{
    public static void main(String args[])
    {
        SuperheroAbstractFactory strong = FactoryProducer.getFactory("Strong");
        StrongSuperhero superman = strong.getStrongHero("Superman");
        superman.save();

        SuperheroAbstractFactory psychic = FactoryProducer.getFactory("Psychic");
        PsychicSuperhero cable = psychic.getPsychicHero("Cable");
        cable.save();

    }
}
