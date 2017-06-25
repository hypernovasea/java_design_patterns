package decorator;

/**
 * Created by artemis on 6/25/17.
 */
public class Intellect extends SuperpowerDecorator
{
    Superperson superperson;

    public Intellect(Superperson superperson)
    {
        this.superperson = superperson;
    }

    public String getDescription()
    {
        return superperson.getDescription() + "Genius. ";
    }


    public int powers()
    {
        return superperson.powers() + 1;
    }
}
