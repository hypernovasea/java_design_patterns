package abstract_factory;


public class StrongSuperheroFactory extends SuperheroAbstractFactory {

    public StrongSuperhero getStrongHero(String hero) {
        if(hero.equalsIgnoreCase("Superman"))
            return new Superman();
        else if(hero.equalsIgnoreCase("Hulk"))
            return new Hulk();
        else if(hero.equalsIgnoreCase("The Thing"));
            return new TheThing();
    }

    public FastSuperhero getFastHero(String speedster) {
        return null;
    }

    public PsychicSuperhero getPsychicHero(String psychic) {
        return null;
    }
}
