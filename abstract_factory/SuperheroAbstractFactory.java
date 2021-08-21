package abstract_factory;


public abstract class SuperheroAbstractFactory {

    abstract StrongSuperhero getStrongHero(String brawn);

    abstract FastSuperhero getFastHero(String speedster);

    abstract PsychicSuperhero getPsychicHero(String psychic);


}
