package observer;

/**
 * Created by artemis on 6/24/17.
 */
public class Romantic implements Observer{

    private RomanceSubject subject;
    private String name;
    private String current_book;

    public Romantic(RomanceSubject subject, String name)
    {
        this.name = name;
        subject.registerRomantic(
                this);
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
        subject.removeRomantic(this);
    }
}
