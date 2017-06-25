package decorator;

/**
 * Created by artemis on 6/25/17.
 */
public class Telekinesis extends SuperpowerDecorator
{
    Superperson superperson;

    public Telekinesis(Superperson superperson)
    {
        this.superperson = superperson;
    }

    public String getDescription()
    {
        return superperson.getDescription() + "Moving matter with the mind. ";
    }


    public int powers()
    {
        return superperson.powers() + 1;
    }
}
