package observer;

/**
 * Created by artemis on 6/24/17.
 */
public interface Observer {

    public void update(String current_book);

    public String getName();

    public String getCurrentBook();

}
