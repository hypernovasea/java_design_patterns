package observer;

public interface HumorSubject {

    public void registerComedian(Observer o);


    public void removeComedian(Observer o);


    public void notifyComedians();

}
