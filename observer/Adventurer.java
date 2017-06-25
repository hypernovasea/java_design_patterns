package observer;

import javax.security.auth.Subject;

/**
 * Created by artemis on 6/24/17.
 */
public class Adventurer implements Observer{

    private AdventureSubject subject;
    private String name;
    private String current_book;

    public Adventurer(AdventureSubject subject, String name)
    {
        this.name = name;
        subject.registerAdventurer(this);
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
        subject.removeAdventurer(this);
    }
}
