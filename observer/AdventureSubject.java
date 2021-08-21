package observer;

public interface AdventureSubject {

    public void registerAdventurer(Observer o);


    public void removeAdventurer(Observer o);


    public void notifyAdventurers();
}
