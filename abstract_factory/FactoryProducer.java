package abstract_factory;

/**
 * Created by artemis on 6/26/17.
 */
public class FactoryProducer
{
    public static SuperheroAbstractFactory getFactory(String choice)
    {
        if(choice.equalsIgnoreCase("Strong")) {
            return new StrongSuperheroFactory();
        }
        else if(choice.equalsIgnoreCase("Fast")) {
            return new FastSuperheroFactory();
        }
        else {
            return new PsychicSuperheroFactory();
        }
    }
}
