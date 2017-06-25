package observer;

/**
 * Created by artemis on 6/24/17.
 */
public class Nerd implements Observer{

    private SciFiSubject subject;
    private String name;
    private String current_book;

    public Nerd(SciFiSubject subject, String name)
    {
        this.name = name;
        subject.registerNerd(this);
    }


    public void update(String current_book)
    {
        this.current_book = current_book;
    }


    public String getName()
    {
        return name;
    }


    public String getCurrentBook()
    {
        return current_book;
    }

    public void unregister(){
        subject.removeNerd(this);
    }

}
