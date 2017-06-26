package abstract_factory;

/**
 * Created by artemis on 6/26/17.
 */
public class FastSuperheroFactory extends SuperheroAbstractFactory
{
    public FastSuperhero getFastHero(String hero)
    {
        if(hero.equalsIgnoreCase("The Flash"))
            return new TheFlash();
        else if(hero.equalsIgnoreCase("Quicksilver"))
            return new Quicksilver();

        return null;

    }

    public StrongSuperhero getStrongHero(String brawn)
    {
        return null;
    }

    public PsychicSuperhero getPsychicHero(String psychic)
    {
        return null;
    }
}
