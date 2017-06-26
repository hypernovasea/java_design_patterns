package abstract_factory;

/**
 * Created by artemis on 6/26/17.
 */
public abstract class SuperheroAbstractFactory {

    abstract StrongSuperhero getStrongHero(String brawn);

    abstract FastSuperhero getFastHero(String speedster);

    abstract PsychicSuperhero getPsychicHero(String psychic);


}
