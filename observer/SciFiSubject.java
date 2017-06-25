package observer;

/**
 * Subject interface that notifies the adventure observers.
 */
public interface SciFiSubject {

    public void registerNerd(Observer o);


    public void removeNerd(Observer o);


    public void notifyNerds();

}
