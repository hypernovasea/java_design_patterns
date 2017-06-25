package observer;

/**
 * Subject interface that notifies the adventure observers.
 */
public interface RomanceSubject {

    public void registerRomantic(Observer o);


    public void removeRomantic(Observer o);


    public void notifyRomantics();

}
