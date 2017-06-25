package observer;

/**
 * Subject interface that notifies the adventure observers.
 */
public interface AdventureSubject {

    public void registerAdventurer(Observer o);


    public void removeAdventurer(Observer o);


    public void notifyAdventurers();
}
