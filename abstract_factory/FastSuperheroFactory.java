package abstract_factory;


public class FastSuperheroFactory extends SuperheroAbstractFactory {

    public FastSuperhero getFastHero(String hero) {
        if(hero.equalsIgnoreCase("The Flash"))
            return new TheFlash();
        else if(hero.equalsIgnoreCase("Quicksilver"))
            return new Quicksilver();
        return null;
    }

    public StrongSuperhero getStrongHero(String brawn) {
        return null;
    }

    public PsychicSuperhero getPsychicHero(String psychic) {
        return null;
    }
}
